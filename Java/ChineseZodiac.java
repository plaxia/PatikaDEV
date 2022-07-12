import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) {
        int yr;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your year of birth : ");
        yr= input.nextInt();
        if(yr%12==0)
        {
            System.out.println("Monkey");
        }
        if(yr%12==1)
        {
            System.out.println("Rooster");
        }
        if(yr%12==2)
        {
            System.out.println("Dog");
        }
        if(yr%12==3)
        {
            System.out.println("Pig");
        }
        if(yr%12==4)
        {
            System.out.println("Rat");
        }
        if(yr%12==5)
        {
            System.out.println("Ox");
        }
        if(yr%12==6)
        {
            System.out.println("Tiger");
        }
        if(yr%12==7)
        {
            System.out.println("Rabbit");
        }
        if(yr%12==8)
        {
            System.out.println("Dragon");
        }
        if(yr%12==9)
        {
            System.out.println("Snake");
        }
        if(yr%12==10)
        {
            System.out.println("Horse");
        }
        if(yr%12==11)
        {
            System.out.println("Goat");
        }

    }
}
