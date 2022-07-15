import java.util.Scanner;
public class PowerwithMethods {
    static int result=1;
    static int pow (int n1,int n2)
    {


        if(n2==0||n1==1)
        {
            return 1;
        }

        else{
            result=n1*result;
            pow (n1,n2-1);

            return result;

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2;
        System.out.print("Enter base");
        n1=input.nextInt();
        System.out.print("Enter exponent");
        n2=input.nextInt();
        System.out.println(pow(n1,n2));

    }
}
