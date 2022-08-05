import java.util.Arrays;

public class Frequency
{

    public static void main(String[] args)
    {
        int ct=0;
        int [] list ={1,3,3,4,4,5,6,4};
        int count [] = new int[list.length];
        for ( int i = 0; i <list.length ; i++)
        {
            count[i] =1;
            for (int j = 0; j <list.length ; j++)
            {
                if(list[i]==list[j]&&i!=j)
                {
                    count[i]++;

                }



            }

        }
        for (int i = 0; i <list.length; i++)
        {
            for (int j = i+1; j < list.length ; j++)
            {
                if(list[i]==list[j]){
                    list[j]=0;
                }
            }
        }
        for (int i = 0; i <list.length ; i++) {
            if(list[i]!=0&&count[i]>1)
            {
                System.out.println(list[i]+"was repeated "+count[i]+"times ");
            }
        }
    }

}
