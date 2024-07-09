/*    */ package Volar;
/*    */ 
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class FlyCommand
/*    */   implements CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender sender, Command command, String alias, String[] args) {
/* 12 */     if (command.getName().equalsIgnoreCase("fly")) {
/* 13 */       if (!(sender instanceof Player)) {
/* 14 */         sender.sendMessage("Este comando solo puede ser ejecutado por un jugador.");
/* 15 */         return true;
/*    */       } 
/*    */       
/* 18 */       Player player = (Player)sender;
/*    */       
/* 20 */       if (player.getAllowFlight()) {
/* 21 */         player.setAllowFlight(false);
/* 22 */         player.sendMessage("Modo vuelo desactivado.");
/*    */       } else {
/* 24 */         player.setAllowFlight(true);
/* 25 */         player.sendMessage("Modo vuelo activado");
/*    */       } 
/* 27 */       return true;
/*    */     } 
/* 29 */     return false;
/*    */   }
/*    */ }


/* Location:              D:\server\plugins\Aplugin.jar!\Volar\FlyCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */