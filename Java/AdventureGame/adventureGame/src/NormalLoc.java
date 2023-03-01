public abstract class NormalLoc extends Location {
    public NormalLoc(Player player, String locName) {
        super(player, locName);
    }

   public boolean onLocation() {
        return true;
    }
}
