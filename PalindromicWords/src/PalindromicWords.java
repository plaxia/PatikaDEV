import java.util.Arrays;
import java.util.Scanner;

public class PalindromicWords {
    static boolean Reverse(String str)
    {
       String reverse="";


            for (int j =str.length()-1; j >=0; j--)
            {
            reverse+=str.charAt(j);
            }

        System.out.println(reverse);
        if(reverse.equals(str)){

            return true;
        }
        else {

            return false;
        }
    }
    static boolean isPalindrome(String str)
    {
       if(Reverse(str)==true)
       {
           System.out.println("Word is palindrome");
           return true;
       }
else
        System.out.println("Word is not palindrome");
       return false;
    }
    public static void main(String[] args)
    {
        isPalindrome("abba");
    }
}
