import java.util.Random;
public class Match {
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;
    Match(int maxWeight,int minWeight,Fighter f1 , Fighter f2)
    {
this.maxWeight=maxWeight;
this.minWeight=minWeight;
this.f1=f1;
this.f2=f2;
    }
    void run()
    {
        if((f1.weight>=this.minWeight)&&(f1.weight<=this.maxWeight)&&(f2.weight>=this.minWeight)&&(f2.weight<=this.maxWeight))
        {

            firstDamg(f1,f2);
            System.out.println(f1.name+"'s health :"+f1.health+"\n" +f2.name+"'s health :"+f2.health);
            while ((f1.health>0)&&(f2.health>0))
            {
                dodgeRnd(f1,f2);

                System.out.println(f1.name+"'s health: "+f1.health);
                System.out.println(f2.name+"'s health: "+f2.health);
            }
            if(f1.health==0)
            {
                System.out.println(f1.name+" Knocking out.");
            }
            else if (f2.health==0)
            {
                System.out.println(f2.name+" Knocking out.");
            }
            else
            {
                System.out.println("Fight is going on.");
            }
        }
        else
        {
            System.out.println("Wrong weight");
        }
    }
    int hit(Fighter fighter)
    {
        return fighter.damage;
    }
    void dodgeRnd(Fighter f1,Fighter f2)
    {
         Random rnd = new Random();
         int x = rnd.nextInt(100);

         if(x<=f1.dodge)
         {
             System.out.println("Dodged by "+f1.name);
             f1.health=f1.health;

         }
         else
         {
            f1.health-=hit(f2);
         }
        if(x<=f2.dodge)
        {
            System.out.println("Dodged by "+f2.name);
            f2.health=f2.health;

        }
        else
        {
            f2.health-=hit(f1);
        }

    }
    void firstDamg(Fighter f1,Fighter f2)
    {
        Random rnd = new Random();
        int x = rnd.nextInt(100);
        System.out.println(x);
        if(x>=50)
        {
            System.out.println("First damage by "+f2.name);
            f1.health-=hit(f2);
        }
        else
        {
            System.out.println("First damage by "+f1.name);
            f2.health-=hit(f1);
        }
    }
}
