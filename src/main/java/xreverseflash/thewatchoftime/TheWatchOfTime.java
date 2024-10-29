package xreverseflash.thewatchoftime;

import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TheWatchOfTime implements ModInitializer {

	public static final TimeWatchItem TIME_WATCH =
			Registry.register(Registries.ITEM, Identifier.of("thewatchoftime", "time_watch"),
					new TimeWatchItem(new Item.Settings().maxCount(1)));
	
	@Override
	public void onInitialize() {
	}
}