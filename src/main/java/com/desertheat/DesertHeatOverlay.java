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

    @Inject
    public DesertHeatOverlay(DesertHeatPlugin plugin)
    {
        this.plugin = plugin;

        setLayer(OverlayLayer.ABOVE_WIDGETS);
        setPosition(OverlayPosition.TOP_CENTER);
    }


    @Override
    public Dimension render(Graphics2D graphics)
    {

        final FontMetrics fontMetrics = graphics.getFontMetrics();

        panelComponent.setPreferredSize(new Dimension(100, 0));

        panelComponent.getChildren().add(TitleComponent.builder()
                .text("servings: " + plugin.waterServingsCount)
                .build());
        panelComponent.getChildren().add(TitleComponent.builder()
                .text("drain rate: " + plugin.drainRateUpdated)
                .build());
        panelComponent.getChildren().add(TitleComponent.builder()
                .text("Time Left: " + plugin.convertTicksToTime(plugin.waterServingsCount * plugin.drainRateUpdated - plugin.tickCount))
                .build());





        final ProgressBarComponent waterBar = new ProgressBarComponent();
        Color waterColour = new Color(50, 116, 212, 90);
        Color waterFilledColour = new Color(50, 55, 212, 90);


        if (plugin.sipTimer> -1) {
            waterBar.setLabelDisplayMode(ProgressBarComponent.LabelDisplayMode.BOTH);
            waterBar.setMaximum(plugin.drainRate);
            waterBar.setValue(plugin.sipTimer);


            if (plugin.waterServingsCount <= 0 ){
                waterColour = new Color(190, 62, 62, 90);
                waterFilledColour = new Color(155, 0, 0, 230);
            }

        } else{
            waterColour = new Color(91, 86, 86, 100);
            waterFilledColour = new Color(189, 183, 183, 100);
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


        waterBar.setLabelDisplayMode(ProgressBarComponent.LabelDisplayMode.FULL);
        panelComponent.getChildren().add(waterBar);

        return super.render(graphics);
    }

}

