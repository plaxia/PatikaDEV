import java.util.Scanner;
public class project11 {
    public static void main(String[] args)
    {
        int deg ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter air temperature");
        deg= input.nextInt();
        if(deg<5)
        {
            System.out.println("Ski");
        }
        if(deg<=15&&deg>5)
        {
            System.out.println("Cinema");
        }
        if(deg<=25&&deg>15)
        {
            System.out.println("Picnic");
        }
        if(deg>25)
        {
            System.out.println("Swimming");
        }
    }
}
