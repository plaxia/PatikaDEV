import java.util.Random;

public abstract class BattleLoc extends Location {
    private Obstacle obstacle;
    private String award;
    private int obstNum;
    Random firstAttack=new Random();
    int random=firstAttack.nextInt(2);
    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getObstNum() {
        return obstNum;
    }

    public void setObstNum(int obstNum) {
        this.obstNum = obstNum;
    }

    public BattleLoc(Player player, String locName, Obstacle obstacle, String award, int obstNum  ) {
        super(player, locName);
        this.obstacle=obstacle;
        this.award=award;
        this.obstNum=obstNum;
    }
    public int rndObstacle(){
        Random rnd=new Random();
                return rnd.nextInt(getObstNum())+1;
    }

    @Override
    public boolean onLocation() {
        int gnrtdObst=this.rndObstacle();
        System.out.println("#######-"+" "+this.getLocName().toUpperCase()+" "+"-#######");
        System.out.println("Be careful there may be "+gnrtdObst+" "+this.getObstacle().getName()+" ");
        System.out.println("<F> : Press F for fight");
        System.out.println("<E> : Press E for escape");
        String select=scanner.nextLine();
       select=select.toUpperCase();
        if(select.equals("F")){
            System.out.println("-----The war is beginning.Good Luck-----");
            if(combat(gnrtdObst)){
                System.out.println("you destroyed all enemies");
                return true;
            }
        }
        if(this.getPlayer().getHealth()<=0){
            System.out.println("You die");
            return false;
        }
        if(select.equals("E")){
            System.out.println("Peace won");
        }
        return true;
    }

    public boolean combat(int obsNumber) {

        for (int i = 1; i <=obsNumber ; i++)
        {


            this.getObstacle().setHealth(this.getObstacle().getDefHealth());
            combatStats();
            while(this.getObstacle().getHealth()>0&&this.getPlayer().getHealth()>0)
            {
                System.out.println();
            System.out.println("<H>it : Press H for hit to "+this.getObstacle().getName());
            System.out.println("<E>scape : Press E for escape from "+this.getObstacle().getName());
                System.out.println();
                System.out.print("<H> or <E> :");
            String comCase=scanner.nextLine().toUpperCase();
            if(comCase.equals("H"))
                {

                    if(random==1){
                        System.out.println("You will shot first! ");
                        System.out.println("You hit to "+i+"."+this.getObstacle().getName());
                        this.getObstacle().setHealth(this.getObstacle().getHealth()-this.getPlayer().getDamage());
                        afterHit();
                    }
                    else if (random==0) {

                        System.out.println(this.getObstacle().getName()+" "+" will shot first! ");

                        if(this.getObstacle().getHealth()>0)
                        {
                            System.out.println(i+"."+this.getObstacle().getName()+" "+"hit to you");
                            int obstDamage=this.getObstacle().getDamage()-this.getPlayer().getInventory().getArmors().getDefence();
                            if(obstDamage<0)
                            {
                                obstDamage=0;
                            }
                            this.getPlayer().setHealth(this.getPlayer().getHealth()-obstDamage);
                            afterHit();
                        }
                    }
                    System.out.println("You hit to "+i+"."+this.getObstacle().getName());
                    this.getObstacle().setHealth(this.getObstacle().getHealth()-this.getPlayer().getDamage());
                    afterHit();
                    if(this.getObstacle().getHealth()>0)
                    {
                        System.out.println(i+"."+this.getObstacle().getName()+" "+"hit to you");
                        int obstDamage=this.getObstacle().getDamage()-this.getPlayer().getInventory().getArmors().getDefence();
                        if(obstDamage<0)
                        {
                            obstDamage=0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth()-obstDamage);
                        afterHit();
                    }


                }
            else {
                return false;
            }
            }

            if(this.getObstacle().getHealth()<this.getPlayer().getHealth())
            {
                System.out.println("You won!");
                this.getPlayer().setMoney(this.getPlayer().getMoney()+this.getObstacle().getCoin());
                System.out.println("Your Award: "+this.getAward());
                System.out.println(" available money :"+this.getPlayer().getMoney());
                if(this.getObstacle().getName().equals("Zombie")){
                    this.getPlayer().getInventory().setCaveAward(Awards.awards()[1]);
                    System.out.println("Odulunuz:"+this.getPlayer().getInventory().getCaveAward().getAwardName());
                }
                if(this.getObstacle().getName().equals("Vampire")){
                    this.getPlayer().getInventory().setForestAward(Awards.awards()[2]);
                    System.out.println("Odulunuz:"+this.getPlayer().getInventory().getForestAward().getAwardName());

                }
                if(this.getObstacle().getName().equals("Bear")){
                    this.getPlayer().getInventory().setRiverAward(Awards.awards()[0]);
                    System.out.println("Odulunuz:"+this.getPlayer().getInventory().getRiverAward().getAwardName());
                }
            }
        }

        return false;
    }

    private void combatStats() {
        System.out.println("**********---"+getPlayer().getName()+"---**********");
        System.out.println(this.getPlayer().getName()+""+"'s Health: "+this.getPlayer().getHealth());
        System.out.println(this.getPlayer().getName()+""+"'s Damage: "+this.getPlayer().getDamage());
        System.out.println("**********---"+getObstacle().getName()+"---**********");
        System.out.println(this.getObstacle().getName()+" "+" health: "+this.getObstacle().getHealth());
        System.out.println(this.getObstacle().getName()+" "+"damage: "+this.getObstacle().getDamage());
    }

    private void afterHit() {
        System.out.println("Your Health : "+" "+this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName()+" "+"health :"+this.getObstacle().getHealth());
        System.out.println("---------");
    }
}
