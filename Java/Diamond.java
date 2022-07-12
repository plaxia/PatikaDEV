import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n1 = input.nextInt();

        for (int i = 0; i <= n1 ; i++)
        {
            for (int j = 0; j < (n1 - i); j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = 0; i <= n1 ; i++)
        {
            for (int j = 0; j < (i+1); j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= (7-2*i); k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}