public class CheckSameNumbers
{
    public static void main(String[] args)
    {
        int [] list ={1,3,3,4,4,5,6};
        for (int i = 0; i <list.length ; i++)
        {
            for (int j = 0; j <list.length ; j++)
            {
                if(list[i]==list[j]&&i!=j&&list[i]%2==0)
                    System.out.println(list[i]);
            }
        }
    }

}
