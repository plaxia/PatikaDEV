import java.util.Arrays;
public class MatrixTranspose {
    public static void main(String[] args)
    {
        int [][] org =
                {
                {1,2,3},{4,5,6}
    };
        int [][] transpose=new int[org.length][org[0].length];
        System.out.println("Original matrix is :");
        for (int i = 0; i <org.length ; i++)
        {
            for (int j = 0; j <org[0].length ; j++)
            {
                System.out.print(org[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Transpose of this matrix :");
        for (int j = 0; j < 3 ; j++)
        {
            for (int k = 0; k <2 ; k++)
            {
                System.out.print(org[k][j]+" ");
            }
            System.out.println("");
        }
    }
}
