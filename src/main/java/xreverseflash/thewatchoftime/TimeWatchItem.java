package xreverseflash.thewatchoftime;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.world.tick.TickManager;

public class TimeWatchItem extends Item {
    public TimeWatchItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        TickManager tickManager = world.getTickManager();
        if (!tickManager.isFrozen()) {
            tickManager.setFrozen(true);
            playerEntity.playSound(SoundEvents.BLOCK_METAL_PRESSURE_PLATE_CLICK_ON, 1.0F, 1.0F);
        } else {
            tickManager.setFrozen(false);
            playerEntity.playSound(SoundEvents.BLOCK_METAL_PRESSURE_PLATE_CLICK_OFF, 1.0F, 1.0F);
        }
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}
