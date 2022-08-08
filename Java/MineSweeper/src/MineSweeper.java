import java.util.Random;
import java.util.Scanner;
public class MineSweeper
{
    Random rn = new Random();
    Scanner scn=new Scanner(System.in);
    int row,colm;
    Scanner inp = new Scanner(System.in);
    String [][]array;
    public void rowColm(int row,int colm)
    {
        this.array=new String[row][colm];
this.row=row;
this.colm=colm;
    }

    public void create()
    {
        for (int i = 0; i <row ; i++)
        {
            for (int j = 0; j <colm ; j++)
            {
                array[i][j] = "-";
            }


        }
    }
    public void print()
    {
        for (int i = 0; i <row ; i++)
        {
            for (int j = 0; j <colm ; j++)
            {
                System.out.print(array[i][j]);
            }
            System.out.println(" ");
        }
    }
    public void mineAdd()
    {
        int mine =(row*colm)/4;
        int rw=rn.nextInt(row);
        int clm=rn.nextInt(colm);
        while(mine>0)
        {
            rw=rn.nextInt(row);
            clm=rn.nextInt(colm);
            array[rw][clm]="*";
            mine--;
        }
    }
    public void print2()
    {
        for (int i = 0; i <row ; i++)
        {
            for (int j = 0; j <colm ; j++)
            {
                System.out.print(array[i][j]="-");
            }
            System.out.println(" ");
        }
    }
   /* public void control(int a,int b)
    {
        int count = 1;
      a =scn.nextInt();
       b = scn.nextInt();
        while(array[a][b]!="*")
        {
            System.out.println("Enter a row");
            a =scn.nextInt();
            System.out.println("Enter a column");
            b = scn.nextInt();
            if(array[a][b+1].equals("*)){
                count++;
                System.out.println(count);
            }
        }
    }*/
    public void run()
    {
        int count =0;
        System.out.print("Enter a row: ");
        int row =scn.nextInt();
        System.out.print("Enter a column: ");
        int colm = scn.nextInt();
        System.out.println("Welcome to MineSweeper");
        rowColm(row,colm);
        create();
        mineAdd();
        print();
        System.out.println("\n");

        System.out.println("\n");
        System.out.print("Enter a row: ");
int a =scn.nextInt();
        System.out.print("Enter a column: ");
int b = scn.nextInt();
//if(a>row+1||b>colm+1||a<-2||b<-2)
/*{
    System.out.println("Hatali giris yaptiniz.");

}*/
//else{
  while(!array[a][b].equals("*"))
  {

      System.out.print("Enter a row: ");
a =scn.nextInt();
      System.out.print("Enter a column: ");
b = scn.nextInt();
print();
      System.out.println("\n");
      if(a+1<=row-1&&array[a+1][b].equals("*"))
     {
     count++;
        array[a][b]= String.valueOf(count);
     }

      if(a-1!=-1&&array[a-1][b].equals("*"))
         {
             count++;
             array[a][b]= String.valueOf(count);

         }


      if(b+1<=colm-1&&array[a][b+1].equals("*"))
         {
             count++;
             array[a][b]= String.valueOf(count);

         }
      if(b-1!=-1&&array[a][b-1].equals("*"))
         {
             count++;
             array[a][b]= String.valueOf(count);

         }

      if(b+1<=colm-1&&a-1!=-1&&array[a-1][b+1].equals("*"))
         {
             count++;
             array[a][b]= String.valueOf(count);

         }
      if(a+1<=row-1&&b-1!=-1&&array[a+1][b-1].equals("*"))
         {
             count++;
             array[a][b]= String.valueOf(count);

         }
      if(b+1<=colm-1&&a+1<=row-1&&array[a+1][b+1].equals("*"))
         {
             count++;
             array[a][b]= String.valueOf(count);

         }
      if(a-1!=-1&&b-1!=-1&&array[a-1][b-1].equals("*"))
         {
             count++;
             array[a][b]= String.valueOf(count);
         }

   print();
      count=0;
  }
if(array[a][b].equals("*"))
{
    System.out.println("Game Over");
}

    }
}
