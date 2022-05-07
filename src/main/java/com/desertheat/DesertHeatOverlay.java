package com.desertheat;
import java.awt.*;
import javax.inject.Inject;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.ProgressBarComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

public class DesertHeatOverlay extends OverlayPanel {
    private final DesertHeatPlugin plugin;
    private final DesertHeatConfig config;



    @Inject
    public DesertHeatOverlay(DesertHeatPlugin plugin, DesertHeatConfig config)
    {
        this.plugin = plugin;
        this.config = config;

        setLayer(OverlayLayer.ABOVE_WIDGETS);
        setPosition(OverlayPosition.TOP_CENTER);
    }


    @Override
    public Dimension render(Graphics2D graphics)
    {


        final FontMetrics fontMetrics = graphics.getFontMetrics();
        panelComponent.setPreferredSize(new Dimension(100, 0));

        if (config.showWaterServings()){
            panelComponent.getChildren().add(TitleComponent.builder()
                    .text("Servings: " + plugin.waterServingsCount)
                    .build());
        }
        if (config.showDrainRate()){

            if (config.timeFormat().getTimeFormat().equals("Seconds")){
                panelComponent.getChildren().add(TitleComponent.builder()
                        .text("Drain Rate: every " + plugin.convertTicksToTime(plugin.drainRateUpdated ) )
                        .build());
            }else{
                panelComponent.getChildren().add(TitleComponent.builder()
                        .text("Drain Rate: every " + plugin.drainRateUpdated / config.timeFormat().getAdjustmentFactor() + " Ticks")
                        .build());
            }

        }

        if (plugin.waterServingsCount<= 0) {
                panelComponent.getChildren().add(TitleComponent.builder()
                        .text("Time Left: NO WATER" )
                        .build());
        }else {
                if (plugin.sipTimer > -1){
                    panelComponent.getChildren().add(TitleComponent.builder()
                            .text("Time Left: " + plugin.convertTicksToTime(plugin.waterServingsCount * plugin.drainRateUpdated - plugin.tickCount))
                            .build());

                }else{
                    panelComponent.getChildren().add(TitleComponent.builder()
                            .text("Time Left: ~" + plugin.convertTicksToTime(plugin.waterServingsCount * plugin.drainRateUpdated))
                            .build());
                }
        }


        final ProgressBarComponent waterBar = new ProgressBarComponent();
        Color waterColour = new Color(50, 116, 212, 90);
        Color waterFilledColour = new Color(50, 55, 212, 90);


        if (plugin.sipTimer> -1) {
           // waterBar.setLabelDisplayMode(ProgressBarComponent.LabelDisplayMode.BOTH);

            if (config.timeFormat().getTimeFormat().equals("Seconds")){
                waterBar.setMaximum((long) (plugin.drainRate  * .6));
                waterBar.setValue(plugin.sipTimer * .6);
            }else{
                waterBar.setMaximum(plugin.drainRate);
                waterBar.setValue(plugin.sipTimer);
            }

            waterBar.setLabelDisplayMode(ProgressBarComponent.LabelDisplayMode.FULL);

            if (plugin.waterServingsCount <= 0 ){
                waterColour = new Color(190, 62, 62, 90);
                waterFilledColour = new Color(155, 0, 0, 230);
            }

        } else{
            waterColour = new Color(33, 27, 22,90);
            waterFilledColour = new Color(33, 27, 22,90);
            waterBar.setMaximum(0);
            waterBar.setValue(0);
            waterBar.setLabelDisplayMode(ProgressBarComponent.LabelDisplayMode.TEXT_ONLY);

            if (plugin.waterServingsCount <= 0){
                    waterBar.setCenterLabel("Waiting For Damage");
            }else {
                waterBar.setCenterLabel("Waiting For Sip");
            }// waterBar.setDimmed(true);
        }

        waterBar.setBackgroundColor(waterColour);
        waterBar.setForegroundColor(waterFilledColour);

        panelComponent.getChildren().add(waterBar);
        panelComponent.setGap(new Point(1,1));

        return super.render(graphics);
    }

}

