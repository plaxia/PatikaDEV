public class Inventory {
    private Weapons weapons;
    private Armors armors;
    private Awards riverAward;
    private Awards forestAward;
    private Awards caveAward;

    public Awards getRiverAward() {
        return riverAward;
    }

    public void setRiverAward(Awards riverAward) {
        this.riverAward = riverAward;
    }

    public Awards getForestAward() {
        return forestAward;
    }

    public void setForestAward(Awards forestAward) {
        this.forestAward = forestAward;
    }

    public Awards getCaveAward() {
        return caveAward;
    }

    public void setCaveAward(Awards caveAward) {
        this.caveAward = caveAward;
    }

    public Armors getArmors() {
        return armors;
    }

    public void setArmors(Armors armors) {
        this.armors = armors;
    }

    public Weapons getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapons weapons) {
        this.weapons = weapons;
    }

    public Inventory() {
        this.weapons=new Weapons("Punch",0,0,0);
        this.armors=new Armors("Leather Armor",0,0,0);
        this.riverAward=new Awards("null","River");
        this.caveAward=new Awards("null","Cave");
        this.forestAward=new Awards("null","Forest");


    }
}
