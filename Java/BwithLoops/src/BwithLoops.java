public class BwithLoops {
    public static void main(String[] args)
    {
        String [][] a=new String[7][5];
        for (int i = 0; i <a.length; i++)
        {

            for (int j = 0; j < a[i].length ; j++)
            {

                if(i==0||i==3||i==6)
                {
                    System.out.print("*");
                }
                else if (j==0)
                {
                    System.out.print("*");
                } else if (j!=5)
                {
                    System.out.print(" ");
                }
            }

            System.out.println("*");

        }
    }
}
