import java.util.Scanner;
public class PerfectNumber
{
    public static void main(String[] args)
    {
        int n1,sum=0;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a integer :");
        n1=input.nextInt();

        for (int i = 1; i <=n1 ; i++)
        {
            if(n1%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum-n1==n1){
            System.out.println("N1 is a perfect number");
        }
        else{
            System.out.println("N1 is not a perfect number");
        }

    }
}




