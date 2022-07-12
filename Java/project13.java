import java.util.Scanner;
public class project13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int num= input.nextInt();
        int odd ;

        for (int i = 0; i <num ; i++)
        {
            if(num%2==0)
            {
                odd=num;
                if(i==odd)
                {
                    System.out.println("Odds are :"+odd);
                }
            }

        }
    }
}
