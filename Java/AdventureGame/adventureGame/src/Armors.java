public class Armors {
    private int id;

    private int defence;

    private int cost;

    private String name;

    public Armors(String name,int id, int defence, int cost ) {
        this.id = id;
        this.defence = defence;
        this.cost = cost;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static Armors[] armors(){
        Armors [] armorlist=new Armors[3];
        armorlist[0]=new Armors("Iron Armor",1,1,15);
        armorlist[1]=new Armors("Gold Armor",2,3,25);
        armorlist[2]=new Armors("Diamond Armor",3,5,40);
        return armorlist;
    }
}
