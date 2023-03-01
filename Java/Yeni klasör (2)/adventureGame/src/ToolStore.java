public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(player, "Tool Store");
    }

   public boolean onLocation() {
        boolean showMenu=true;
        while(showMenu){

            System.out.println("You are in Tool Store");
            System.out.println("----------------------------");
            System.out.println("1-Weapons");
            System.out.println("2-Armors");
            System.out.println("3-Exit");
            System.out.println("----------------------------");

            int selectTool=scanner.nextInt();
            while(selectTool<1||selectTool>3){
                System.out.println("Wrong Select.Please Select Again.");
                selectTool=scanner.nextInt();
            }
            switch (selectTool){
                case 1:
                {
                    printWeapon();
                    buyWeapon();

                }
                case 2:
                {
                    printArmor();
                    buyArmor();
                }
                case 3:
                {
                    showMenu=false;
                    break;

                }


            }

        }
       return true;
   }

    private void printArmor() {
        System.out.println("----Armors----");
        for (int i = 0; i <Armors.armors().length ; i++)
        {
            System.out.print("ID: "+Armors.armors()[i].getId());
            System.out.print("\tName: "+Armors.armors()[i].getName()+"\t");
            System.out.print("Defence: "+Armors.armors()[i].getDefence()+"\t");
            System.out.print("Cost: "+Armors.armors()[i].getCost());
            System.out.println();

        }
        System.out.println("0-Exit");
    }

    private void buyArmor() {
        System.out.print("Select an armor");
        int selectedArmorNum=scanner.nextInt();
        while(selectedArmorNum<0 || selectedArmorNum>Armors.armors().length){
            System.out.println("Wrong select.Please select again.");
            System.out.print("Select a weapon");
            selectedArmorNum=scanner.nextInt();
        }
        System.out.println();
if (selectedArmorNum!=0){
    if(Armors.armors()[selectedArmorNum-1].getCost()>this.getPlayer().getMoney())
    {
        System.out.println("You don't have enough balance.");
    }
    else
    {
        this.getPlayer().setMoney(this.getPlayer().getMoney()-Armors.armors()[selectedArmorNum-1].getCost());
        this.getPlayer().getInventory().setArmors(Armors.armors()[selectedArmorNum-1]);
        System.out.println("Successfully Paid");
        System.out.println("Current Balance is :"+this.getPlayer().getMoney());
        printPlayer();
    }
}

    }

    private void printWeapon() {
        System.out.println("----Weapons----");
        for (int i = 0; i <Weapons.weapons().length ; i++)
        {
            System.out.print("ID: "+Weapons.weapons()[i].getId());
            System.out.print("\tName: "+Weapons.weapons()[i].getName()+"\t");
            System.out.print("Damage: "+Weapons.weapons()[i].getDamage()+"\t");
            System.out.print("Cost: "+Weapons.weapons()[i].getCost());
            System.out.println();
        }
        System.out.println("0-Exit");

    }

    private void buyWeapon() {
        System.out.print("Select a weapon");
        int selectedWeaponNum=scanner.nextInt();
        while(selectedWeaponNum<0 || selectedWeaponNum>Weapons.weapons().length){
            System.out.println("Wrong select.Please select again.");
            System.out.print("Select a weapon");
            selectedWeaponNum=scanner.nextInt();
        }
        System.out.println();
        if(selectedWeaponNum!=0){
            if(Weapons.weapons()[selectedWeaponNum-1].getCost()>this.getPlayer().getMoney())
            {
                System.out.println("You don't have enough balance.");
            }
            else
            {
                this.getPlayer().setMoney(this.getPlayer().getMoney()-Weapons.weapons()[selectedWeaponNum-1].getCost());
                this.getPlayer().getInventory().setWeapons(Weapons.weapons()[selectedWeaponNum-1]);

                System.out.println("Successfully Paid");
                System.out.println("Current Balance is :"+this.getPlayer().getMoney());
                printPlayer();
            }
        }

    }

    private void printPlayer() {
        System.out.println("Your Weapon: "+this.getPlayer().getInventory().getWeapons().getName());
        System.out.println("Your Armor: "+this.getPlayer().getInventory().getArmors().getName());


    }


}
