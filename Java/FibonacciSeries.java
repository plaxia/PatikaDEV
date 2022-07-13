import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer");
        int n = input.nextInt();
        int n1=0,n2=1,n3;
        System.out.println("First "+n+" steps of Fibonacci Series :");
        for (int i = 1; i <=n ; i++)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
        }
    }
}