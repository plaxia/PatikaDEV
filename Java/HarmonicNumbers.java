import java.util.Scanner;
public class HarmonicNumbers
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a sum  :");
        int num= input.nextInt();
        double sum=0,tmp=1;
        for (int i = 0; i <num ; i++)
        {
            sum=+(1/i);
        }
        System.out.println(sum);
    }

}

