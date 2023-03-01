public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    public boolean onLocation() {
        System.out.println("You are in Safe House");
        System.out.println("Your Health will refresh");
        if(this.getPlayer().getCharName().equals("Warrior")){

            this.getPlayer().setHealth(24);
        }

        if(this.getPlayer().getCharName().equals("Samurai")){

            this.getPlayer().setHealth(21);
        }
        if(this.getPlayer().getCharName().equals("Archer")){

            this.getPlayer().setHealth(18);
        }
        System.out.println(this.getPlayer().getHealth());

        if(this.getPlayer().getInventory().getForestAward().getAwardName().equals("Firewood")&&this.getPlayer().getInventory().getRiverAward().getAwardName().equals("Water")&&this.getPlayer().getInventory().getCaveAward().getAwardName().equals("Food")){
            System.out.println("Congratulations You Finished the Game");
            return false;
        }
        else return true;
    }
}
