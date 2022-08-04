import java.util.Arrays;
import java.util.Scanner;
public class MaxMinwithArrays
{
    public static void main(String[] args)
    {
        Scanner inp= new Scanner(System.in);
        int[]numbers={56,34,1,8,101,-2,-33};
        System.out.println(Arrays.toString(numbers)); ;
       Arrays.sort(numbers);
        int b = inp.nextInt();
        int c= Arrays.binarySearch(numbers,b);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[c+1]+" is the smallest number greater than "+b);
        System.out.println(numbers[c-1]+" is the greatest number smaller than "+b);

    }
}
