import java.util.Scanner;
public class project1 {
    public static void main(String[] args) {
        Scanner  inp = new Scanner(System.in);

        System.out.print("mat:");
        int mat=inp.nextInt();
        System.out.print("phy:");
        int phy=inp.nextInt();
        System.out.print("chm:");
        int chm=inp.nextInt();
        System.out.print("mus:");
        int mus=inp.nextInt();
        System.out.print("trk:");
        int trk=inp.nextInt();
        int avg =(mat+phy+chm+mus+trk)/5;
        System.out.print("avg ="+avg);
        System.out.println(avg >=60 ?"gecti" : "kaldi");
    }
}
