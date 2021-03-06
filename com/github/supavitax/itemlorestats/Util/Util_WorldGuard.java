/*  1:   */ package com.github.supavitax.itemlorestats.Util;
/*  2:   */ 
/*  3:   */ import com.github.supavitax.itemlorestats.ItemLoreStats;
/*  4:   */ import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
/*  5:   */ import com.sk89q.worldguard.protection.ApplicableRegionSet;
/*  6:   */ import com.sk89q.worldguard.protection.flags.DefaultFlag;
/*  7:   */ import com.sk89q.worldguard.protection.flags.StateFlag.State;
/*  8:   */ import com.sk89q.worldguard.protection.managers.RegionManager;
/*  9:   */ import org.bukkit.entity.Player;
/* 10:   */ 
/* 11:   */ public class Util_WorldGuard
/* 12:   */ {
/* 13:   */   ItemLoreStats main;
/* 14:   */   
/* 15:   */   public Util_WorldGuard(ItemLoreStats instance)
/* 16:   */   {
/* 17:18 */     this.main = instance;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public boolean playerInPVPRegion(Player player)
/* 21:   */   {
/* 22:23 */     ApplicableRegionSet set = ItemLoreStats.plugin.getWorldGuard().getRegionManager(player.getWorld()).getApplicableRegions(player.getLocation());
/* 23:24 */     if (set.getFlag(DefaultFlag.PVP) != null)
/* 24:   */     {
/* 25:25 */       if (((StateFlag.State)set.getFlag(DefaultFlag.PVP)).equals(StateFlag.State.DENY)) {
/* 26:26 */         return true;
/* 27:   */       }
/* 28:28 */       return false;
/* 29:   */     }
/* 30:30 */     return false;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public boolean playerInInvincibleRegion(Player player)
/* 34:   */   {
/* 35:35 */     ApplicableRegionSet set = ItemLoreStats.plugin.getWorldGuard().getRegionManager(player.getWorld()).getApplicableRegions(player.getLocation());
/* 36:36 */     if (set.getFlag(DefaultFlag.INVINCIBILITY) != null)
/* 37:   */     {
/* 38:37 */       if (((StateFlag.State)set.getFlag(DefaultFlag.INVINCIBILITY)).equals(StateFlag.State.ALLOW)) {
/* 39:38 */         return true;
/* 40:   */       }
/* 41:40 */       return false;
/* 42:   */     }
/* 43:42 */     return false;
/* 44:   */   }
/* 45:   */ }


/* Location:           E:\ItemLoreStats.jar
 * Qualified Name:     com.github.supavitax.itemlorestats.Util.Util_WorldGuard
 * JD-Core Version:    0.7.0.1
 */