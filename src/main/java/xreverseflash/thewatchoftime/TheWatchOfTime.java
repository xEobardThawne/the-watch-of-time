package xreverseflash.thewatchoftime;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.ServerTickManager;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.rmi.registry.Registry.*;

public class TheWatchOfTime implements ModInitializer {

	public static final TimeWatchItem TIME_WATCH =
			Registry.register(Registries.ITEM, new Identifier("thewatchoftime", "time_watch"),
					new TimeWatchItem(new FabricItemSettings().maxCount(1)));

	public static final Identifier TIME_STOP_SOUND_ID = new Identifier("thewatchoftime:time_stop");
	public static SoundEvent TIME_STOP_SOUND = SoundEvent.of(TIME_STOP_SOUND_ID);
	public static final Identifier TIME_RESUME_SOUND_ID = new Identifier("thewatchoftime:time_resume");
	public static SoundEvent TIME_RESUME_SOUND = SoundEvent.of(TIME_RESUME_SOUND_ID);

	@Override
	public void onInitialize() {
		Registry.register(Registries.SOUND_EVENT, TheWatchOfTime.TIME_STOP_SOUND_ID, TIME_STOP_SOUND);
		Registry.register(Registries.SOUND_EVENT, TheWatchOfTime.TIME_RESUME_SOUND_ID, TIME_RESUME_SOUND);
	}
}