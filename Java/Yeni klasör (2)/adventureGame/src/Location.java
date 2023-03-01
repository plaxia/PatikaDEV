import java.util.Scanner;

public abstract class Location {
   protected Scanner scanner=new Scanner(System.in);

   private Player player;
   private String locName;

   public Player getPlayer() {
      return player;
   }

   public void setPlayer(Player player) {
      this.player = player;
   }

   public String getLocName() {
      return locName;
   }

   public void setLocName(String locName) {
      this.locName = locName;
   }

   public Location(Player player, String locName) {
      this.player = player;
      this.locName = locName;
   }
abstract boolean onLocation();
}
