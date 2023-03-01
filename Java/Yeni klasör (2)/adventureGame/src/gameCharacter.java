public abstract class gameCharacter {
    private int defHealth;
    private int damage;
    private int health;
    private int money;

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    private String charName;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    public gameCharacter(int money,int health,int damage,String charName)
    {
        this.money=money;
        this.health=health;
        this.damage=damage;
        this.charName=charName;

    }
}
