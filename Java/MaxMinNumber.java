import java.util.Scanner;
public class MaxMinNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n1,max=0,min=0,count,tmp;
        System.out.print("Enter how many number will you enter :");
        count = input.nextInt();
        for (int i = 1; i <=count ; i++)
        {
            System.out.print("Enter numbers :");
            n1 = input.nextInt();
            if(n1>max)
            {
                max=n1;
            }

            if (i==1)
            {
            min=n1;
            }
            if(n1<min)
            {
                min=n1;
            }
        }

        System.out.println("Maximum number is :"+max);
        System.out.println("Minimum number is :"+min);





    }
}




