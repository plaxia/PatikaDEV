import java.util.Scanner;
public class Project3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a price :");
        System.out.printf("First edge : ");
        int edge1 = input.nextInt();
        System.out.printf("Second edge : ");
        int edge2 = input.nextInt();
        System.out.printf("Third edge : ");
        int edge3= input.nextInt();
        int u = (edge1+edge2+edge3)/2;
        int area =u*(u-edge1)*(u-edge2)*(u-edge3);

        System.out.printf("Area of triangle : "+area);
        }
}

