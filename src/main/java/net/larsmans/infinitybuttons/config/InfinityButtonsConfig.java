package net.larsmans.infinitybuttons.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "infinitybuttons")
@Config.Gui.Background("infinitybuttons:textures/block/copper_button.png")
public class InfinityButtonsConfig implements ConfigData {
    @ConfigEntry.Gui.Tooltip(count = 3)
    @ConfigEntry.Gui.EnumHandler(option = ConfigEntry.Gui.EnumHandler.EnumDisplayOption.BUTTON)
    public AlarmEnum alarmSoundType = AlarmEnum.RANGE;

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(min = 16, max = 512)
    public int alarmSoundRange = 64;

    @ConfigEntry.Gui.Tooltip
    public boolean tooltips = true;

    @ConfigEntry.Gui.Tooltip
    public boolean diamondParticles = true;
}