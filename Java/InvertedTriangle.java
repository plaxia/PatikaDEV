import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n1 = input.nextInt();

        for ( int i = n1; i >=1 ; i--)
        {
            for (int j = n1-i; j >0; j--)
            {
                System.out.print(" ");
            }
            for (int k = (2*i)-1;k >0 ; k--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}