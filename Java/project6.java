import java.util.Scanner;
public class project6 {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.printf("Enter your height (in meters) : ");
    double height = input.nextDouble();
        System.out.printf("Enter your weight : ");
    double weight = input.nextDouble();
    double bmi = (weight/(height*height));
        System.out.println("BMI : " + bmi);

    }
}
