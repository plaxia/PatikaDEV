import java.util.Scanner;
public class project10 {
    public static void main(String[] args)
    {
        int mth,mus,trk,chm,phy,avg=0,les=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Math grade : ");
        mth=input.nextInt();
        if(mth<=100&&mth>=0){
            avg=avg+mth;
            les++;
        }
        System.out.println("Enter your Turkish grade : ");
        trk=input.nextInt();
        if(trk<=100&&trk>=0){
            avg=avg+trk;
            les++;
        }
        System.out.println("Enter your Physics grade : ");
        phy=input.nextInt();
        if(phy<=100&&phy>=0){
            avg=avg+phy;
            les++;
        }
        System.out.println("Enter your Chemistry grade : ");
        chm=input.nextInt();
        if(chm<=100&&chm>=0){
            avg=avg+chm;
            les++;
        }
        System.out.println("Enter your Music grade : ");
        mus=input.nextInt();
        if(mus<=100&&mus>=0){
            avg=avg+mus;
            les++;
        }
        System.out.println("Your average = "+(avg/les));
        if (avg>=55)
        {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}
