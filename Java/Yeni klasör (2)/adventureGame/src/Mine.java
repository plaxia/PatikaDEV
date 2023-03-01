import java.util.Random;

public class Mine extends BattleLoc{
    public Mine(Player player) {
        super(player, "Mine", new Snake(), "award", 0);
        Random rnd=new Random();
        this.setObstNum(rnd.nextInt(5)+1);
        int award=rnd.nextInt(1000);
        if(award<450)
        {
            this.setAward("null");
        }
        if(award>450&&award<=480)
        {
            this.setAward("Shotgun");
            this.getPlayer().getInventory().setWeapons(Weapons.weapons()[2]);
        }
        if(award>480&&award<=525){
            this.setAward("Sword");
            this.getPlayer().getInventory().setWeapons(Weapons.weapons()[1]);

        }
        if(award>525&&award<=600){
            this.setAward("Pistol");
            this.getPlayer().getInventory().setWeapons(Weapons.weapons()[0]);

        }
        if(award>600&&award<=630){
            this.setAward("Iron Armor");
            this.getPlayer().getInventory().setArmors(Armors.armors()[0]);
        }
        if(award>630&&award<=675){
            this.setAward("Gold Armor");
            this.getPlayer().getInventory().setArmors(Armors.armors()[1]);

        }
        if(award>675&&award<=750){
            this.setAward("Diamond Armor");
            this.getPlayer().getInventory().setArmors(Armors.armors()[2]);

        }
            if(award>750&&award<=800){
                this.setAward("10 coin");
                this.getPlayer().setMoney(this.getPlayer().getMoney()+10);
            }
            if(award>800&&award<=875)
            {
                this.setAward("5 coin");
                this.getPlayer().setMoney(this.getPlayer().getMoney()+5);
            }
        if(award>875&&award<=1000)
        {
            this.setAward("1 coin");
            this.getPlayer().setMoney(this.getPlayer().getMoney()+1);
        }
        }
}
