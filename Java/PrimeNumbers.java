import java.util.Scanner;

public class PrimeNumbers
{
    public static void main(String[] args)
    {
int count ;
        for (int i = 2; i <=100; i++)
        {
          count=0;
            for (int j = i; j >=1 ; j--)
            {
            if(i%j==0)
                {
                 count++;
                }
            }
            if(count==2){
                System.out.println(i+" is a prime number");
            }
    }
    }
}