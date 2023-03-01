import java.util.Scanner;

public class Player {
Scanner scanner = new Scanner(System.in);

    int defHealth;
    int damage;
    int health;
    int money;
    int id ;
    String name;
    String charName;
    private Inventory inventory;
    private Awards awards;



    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Player (String name)
    {

        this.name=name;
        this.inventory=new Inventory();

    }
    public int i=1;
public void selectChar(){
this.id=id;
    System.out.println("---------Characters---------");
    gameCharacter[] gameCharacters={new Samurai(),new Archer(),new Warrior()};
    for (gameCharacter gc:gameCharacters) {
        System.out.print("ID:"+" "+i+"\t");
        i++;
        System.out.print("Name:"+" "+gc.getCharName()+"\t");
        System.out.print("Damage:"+" "+gc.getDamage()+"\t");
        System.out.print("Health:"+" "+gc.getHealth()+"\t");
        System.out.print("Money:"+" "+gc.getMoney()+"\t");
        System.out.println();

    }
    System.out.println("----------------------------");
    System.out.print("Select a character:");

    int charid=scanner.nextInt();
    switch (charid){
        case 1:
            System.out.println("###########");
            System.out.println("You chose Samurai");
            System.out.println("###########");
            System.out.println();
        this.setCharName(gameCharacters[0].getCharName());
        this.setDamage(gameCharacters[0].getDamage());
        this.setMoney(gameCharacters[0].getMoney());
        this.setHealth(gameCharacters[0].getHealth());
            break;
        case 2:
            System.out.println("###########");
            System.out.println("You chose Archer");
            System.out.println("###########");
            this.setCharName(gameCharacters[1].getCharName());
            this.setDamage(gameCharacters[1].getDamage());
            this.setMoney(gameCharacters[1].getMoney());
            this.setHealth(gameCharacters[1].getHealth());
            break;
        case 3:
            System.out.println("###########");
            System.out.println("You chose Warrior");
            System.out.println("###########");

            this.setCharName(gameCharacters[2].getCharName());
            this.setDamage(gameCharacters[2].getDamage());
            this.setMoney(gameCharacters[2].getMoney());
            this.setHealth(gameCharacters[2].getHealth());
    }
}
public void printInfo(){
    System.out.println("Gun: "+getInventory().getWeapons().getName());
    System.out.println("Armor: "+getInventory().getArmors().getName());
    System.out.println("Gun Damage: "+getInventory().getWeapons().getDamage());
    System.out.println("Defence: "+getInventory().getArmors().getDefence());
    System.out.println("Char Damage: "+getDamage());
    System.out.println("Health: "+getHealth());
}

    public int getDamage() {
        return damage+this.getInventory().getWeapons().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health+this.getInventory().getArmors().getDefence();
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDefHealth() {
        return defHealth;
    }

    public void setDefHealth(int defHealth) {
        this.defHealth = defHealth;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
