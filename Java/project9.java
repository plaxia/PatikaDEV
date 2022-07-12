import java.util.Scanner;
public class project9 {
    public static void main(String[] args) {
        String pw,un;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username");
        un=input.nextLine();
        System.out.println("Enter your password");
        pw=input.nextLine();
        if (un.equals("patika")&&(pw.equals("java123")))
        {
            System.out.println("Login Successfully");
        }
        else System.out.println("Wrong password or username");
    }



    }

