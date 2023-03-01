public class Weapons {

    private int id;
   private int damage;
   private int cost;
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapons(String name , int id, int damage, int cost) {
        this.id = id;
        this.damage = damage;
        this.cost = cost;
        this.name=name;
    }
    public static Weapons[] weapons(){
        Weapons[] weaponlist = new Weapons[3];
        weaponlist[0]=new Weapons("Pistol",1,2,11);
        weaponlist[1]=new Weapons("Sword",2,3,35);
        weaponlist[2]=new Weapons("Shotgun",3,7,45);
        return weaponlist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
