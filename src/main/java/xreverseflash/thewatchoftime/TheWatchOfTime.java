package xreverseflash.thewatchoftime;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TheWatchOfTime implements ModInitializer {

	public static final TimeWatchItem TIME_WATCH =
			Registry.register(Registries.ITEM, Identifier.of("thewatchoftime", "time_watch"),
					new TimeWatchItem(new Item.Settings().maxCount(1)));
	
	@Override
	public void onInitialize() {
		// Add item before bucket in the tools category in the creative menu
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
				.register(group -> group.addBefore(Items.BUCKET, TIME_WATCH));
	}
}