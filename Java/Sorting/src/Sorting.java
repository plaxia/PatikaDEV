import java.util.Scanner;
import java.util.Arrays;
public class Sorting {
    public static void main(String[] args)
    {
        System.out.println("Enter length of array");
        Scanner input = new Scanner(System.in);
        int lng =input.nextInt();
        int[] arr= new int[lng];
        for (int i = 0; i <arr.length ; i++)
        {

            int a =input.nextInt();
            arr[i]=a;

        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
