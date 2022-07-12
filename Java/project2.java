import java.util.Scanner;
public class project2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a price :");
        int money = input.nextInt();
        int tax;
        if (money<=1000 && money>0){
            tax=money*18/100;
            tax=money+tax;
            System.out.printf("price :"+tax);
        }
        else {
            tax=money*8/100;
            tax=money+tax;
            System.out.printf("price:"+tax);
        }
    }
}
