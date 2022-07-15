import java.util.Scanner;
public class PrimeNumber {
    static void prime(int n1,int sayi)
    {
        int count=0;

if(n1==sayi){
    System.out.println(n1+"is not a prime number");
    return;
}//7
else if(n1%sayi==0)
{
    System.out.println(n1+"is a prime number");
    return;
}

prime(n1,sayi++);


    }
    public static void main(String[] args)
    {
        int n1;
    Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        n1=input.nextInt();
       prime(n1,2);
    }
}
