import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int yr;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a year: ");
        yr= input.nextInt();
        if(yr%4==0)
        {
            System.out.print(yr+" is a leap year");
        }
        else
        {
            System.out.println(yr+" is not a leap year");
        }
    }

}
