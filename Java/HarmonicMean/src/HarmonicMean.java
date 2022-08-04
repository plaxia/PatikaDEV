public class HarmonicMean {
    public static void main(String[] args)
    {
        double sum=0;
      double[] numbers={1,2,3};
        for (int i = 0; i <numbers.length; i++)
        {
        sum+=(1/numbers[i]);
            System.out.println(1/numbers[i]);
        }
        double a =numbers.length/sum;

        System.out.println("Harmonic Mean :"+a);
    }
}
