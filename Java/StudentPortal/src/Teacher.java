public class Teacher {
    String name ;
    String branch;
    int mpno;
    Teacher(String name , String branch,int mpno){
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;
    }
void print()
{
    System.out.println("Name : " +name+"\nBranch : "+branch+"\nMpno: "+mpno);
}
}
