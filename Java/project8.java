import java.util.Scanner;
public class project8 {
    public static void main(String[] args) {
       int n1,n2,op;
        Scanner input = new Scanner(System.in);
        System.out.printf("Calculator\n");
        System.out.printf("Enter First Number");
         n1 =input.nextInt();
        System.out.printf("Enter Second Number");
        n2 =input.nextInt();
        System.out.println("1-Addition 2-Subtraction 3-Multiplaction 4-Division");
        op=input.nextInt();
        if(op==1)
            System.out.println("Equals : "+ (n1+n2));

        else if (op==2){
            System.out.println("Equals : "+ (n1-n2));
        }

       else if (op==3){
            System.out.println("Equals : "+ (n1*n2));
        }
        else if (op==4){
            System.out.println("Equals : "+ (n1/n2));
        }
            else
            System.out.println("Wrong Select");
        }
    }

