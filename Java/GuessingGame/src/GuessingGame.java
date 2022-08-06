import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class GuessingGame
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int num =rand.nextInt(100);
        System.out.println("Eneter an integer");
        System.out.println(num);
        int count =0,ent;
        Scanner inp=new Scanner(System.in);
        while(count<5)
        {
            ent=inp.nextInt();
            if(ent<num)
            {
                System.out.println("Your input lesser than secret number");
                count++;
            } else if (ent>num)
            {
                System.out.println("Your input greater than secret number");
                count++;
            }
            else
            {
                System.out.println("Congratulations.You won!");
                break;
            }
if (count==5){
    System.out.println("You lose");
}
        }
    }
}
