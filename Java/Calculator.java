import java.util.Scanner;
public class Calculator {
    static void plus()
    {
        Scanner input = new Scanner(System.in);
        int n1,tmp=0,count;
        System.out.println("How many integers will you enter?");
        count=input.nextInt();
        for (int i = 1; i <=count ; i++)
        {
            n1=input.nextInt();
            tmp+=n1;
        }
        System.out.println(tmp);
    }
    static void minus()
    {
        Scanner input = new Scanner(System.in);
        int n1,count,result=0;
        System.out.println("How many integers will you enter?");
        count=input.nextInt();
        for (int i = 1; i <=count ; i++)
        {
            n1=input.nextInt();
            if(i==1)
            {
               result+=n1;
                continue;
            }

            result-=n1;

        }
        System.out.println(result);
    }
static void times()
    {
        Scanner input = new Scanner(System.in);
        int n1,tmp=1,count;
        System.out.println("How many integers will you enter?");
        count=input.nextInt();
        for (int i = 1; i <=count ; i++)
        {
            n1=input.nextInt();
            tmp*=n1;
        }
        System.out.println(tmp);
    }
    static void divided()
    {
        Scanner input = new Scanner(System.in);
        int n1,count,result=0;
        System.out.println("How many integers will you enter?");
        count=input.nextInt();
        for (int i = 1; i <=count ; i++)
        {
            n1=input.nextInt();
            if(i!=1&&n1==0){
                System.out.println("You can not enter 0.");
            }
            if(i==1)
            {
                result=n1;
                continue;
            }

            result/=n1;

        }
        System.out.println(result);
    }
    static void power()
    {
        Scanner input = new Scanner(System.in);
        int base,exp,result=1;
        System.out.println("Enter a base value");
        base=input.nextInt();
        System.out.println("Enter an exponent value");
        exp=input.nextInt();
        for (int i = 1; i <=exp ; i++)
        {
            result*=base;
        }
        System.out.println(result);
    }
static void factorial()
    {
        Scanner input = new Scanner(System.in);
        int n1,result=1;
        System.out.println("Enter an integer");
        n1=input.nextInt();
        for (int i = n1; i >=1 ; i--)
        {
            result=i*result;
        }
        System.out.println(result);
    }
    static void mod()
    {
        Scanner input = new Scanner(System.in);
        int n1,n2,result;
        System.out.println("Enter an integer");
        n1=input.nextInt();
        System.out.println("Enter its mod value");
        n2=input.nextInt();
        result=n1%n2;
        System.out.println(n1+" "+"%"+n2+" "+"="+result);
    }
static void rict()
    {
        Scanner input = new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter first edge");
        n1=input.nextInt();
        System.out.println("Enter second edge");
        n2=input.nextInt();
        int area =n1*n2;
        int perimeter=(n1+n2)*2;
        System.out.println("Area of rictangle is :"+area);
        System.out.println("Perimeter of rictangle is :"+perimeter);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Addition\n"
                + "2- Subtraction \n"
                + "3- Multiplaction\n"
                + "4- Dividing\n"
                + "5- Power\n"
                + "6- Factorial\n"
                + "7- Modulo\n"
                + "8- Area and perimeter of rictangle\n"
                + "0- Log out";

        do {
            System.out.println(menu);
            System.out.print("Select an operation :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
              case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
              case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rict();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }
}

