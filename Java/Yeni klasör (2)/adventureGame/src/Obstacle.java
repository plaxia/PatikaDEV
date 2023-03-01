public class Obstacle {
    private int id;
    private int damage;
    private int health;
    private int coin;
    private String name;
    private int defHealth;
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

    public int getHealth() {
        if(health<0){
            health=0;
        }
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        if(health<0){
            health=0;
        }
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getDefHealth() {
        return defHealth;
    }

    public void setDefHealth(int defHealth) {
        this.defHealth = defHealth;
    }

    public Obstacle(String name, int id, int damage, int health, int coin, int defHealth) {
        this.id = id;
        this.damage = damage;
        this.health = health;
        this.name=name;
        this.coin=coin;
        this.defHealth=health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
