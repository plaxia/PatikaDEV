import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter km : ");
        float km = input.nextFloat();
        double price=(10+km*2.2);
    if(price<20)
    {
        System.out.printf("Price : 20");
    }
    else
         {
             System.out.printf("Price : "+price);
         }

    }
}

