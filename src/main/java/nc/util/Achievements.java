package nc.util;

import net.minecraft.item.Item;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class Achievements {
    public final AchievementPage page;

    public Achievements(String name) {
        page = new AchievementPage(name, new Achievement[0]);
        AchievementPage.registerAchievementPage(page);
        
        //cpw.mods.fml.common.FMLCommonHandler.instance().bus().register(this);
    }

    public Achievement registerAchievement(Achievement achievement) {
            page.getAchievements().add(achievement.registerStat());
            return achievement;
    }

    @SubscribeEvent
    public void onCrafting(PlayerEvent.ItemCraftedEvent event) {
        Item item = event.crafting.getItem();
        int damage = event.crafting.getItemDamage();

        for (Achievement a : page.getAchievements()) {
            if (item.equals(a.theItemStack.getItem()) && damage == a.theItemStack.getItemDamage()) {
                event.player.addStat(a, 1);
            }
        }
    }

    @SubscribeEvent
    public void onSmelting(PlayerEvent.ItemSmeltedEvent event) {
        Item item = event.smelting.getItem();
        int damage = event.smelting.getItemDamage();

        for (Achievement b : page.getAchievements()) {
            if (item.equals(b.theItemStack.getItem()) && damage == b.theItemStack.getItemDamage()) {
                event.player.addStat(b, 1);
            }
        }

    }

    @SubscribeEvent
    public void onPickUp(PlayerEvent.ItemPickupEvent event) {
        Item item = event.pickedUp.getEntityItem().getItem();
        int damage = event.pickedUp.getEntityItem().getItemDamage();

        for (Achievement c : page.getAchievements()) {
            if (item.equals(c.theItemStack.getItem()) && damage == c.theItemStack.getItemDamage()) {
                event.player.addStat(c, 1);
            }
        }
    }
}