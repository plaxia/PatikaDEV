import java.util.Scanner;
public class project5 {
    public static void main(String[] args) {
        double pi =3.14;

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a radius : ");
        int r = input.nextInt();
        System.out.printf("Enter an angle : ");
        int angle= input.nextInt();
        double area = (pi * (r*r) * angle) / 360;
        System.out.println("Area : "+area);
    }
}

}
