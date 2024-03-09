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
	
	@Override
	public void onInitialize() {
	}
}