import java.util.Scanner;
public class PalindromeNumbers {

    static boolean isPalindrome (int number){
        int reverse=0,n1=number,n2;
        while(n1!=0){

           n2=n1%10;
            reverse=(reverse*10)+n2;
            n1=n1/10;
        }
        if(reverse==number){
            System.out.println("Palindrome");
            return true;
        }
else {
            System.out.println("Not palindrome");
    return false ;
        }
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer :");
        int n1= input.nextInt(), n2;
        int reverse = 0;


    isPalindrome(n1);

    }
}
