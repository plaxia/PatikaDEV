public class Student {
    String name ;
    int stuNo;
    int classes;
    Course Fizik;
    Course Matematik;
    Course Tarih;
    double avg;
    boolean isPass;
    int sozlu;
    Student(String name,int stuNo,int classes,Course Tarih,Course Fizik, Course Matematik)
    {
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.Fizik=Fizik;
        this.Matematik=Matematik;
        this.Tarih=Tarih;
        this.avg=0.0;
        boolean isPass=false;

    }
    void addBulkExamNote(int Tarih,int Matematik,int Fizik)
    {
        if(0<=Tarih&&Tarih<=100)
        {
            this.Tarih.note=Tarih;

        }
        if(0<=Fizik&&Fizik<=100)
        {
            this.Fizik.note=Fizik;

        }
        if(0<=Matematik&&Matematik<=100)
        {
            this.Matematik.note=Matematik;

        }

    }
    void printNote()
    {
        System.out.println("Matematik notu :"+Matematik.note+"\nFizik Notu :"+Fizik.note+"\nTarih Notu:"+Tarih.note);
    }
void calcAverage()
{
    this.avg=((this.Matematik.note)*0.8+(this.Matematik.sozlu*0.2)+(this.Fizik.sozlu*0.3)+(this.Fizik.note*0.7)+(this.Tarih.note*0.6)+(this.Tarih.sozlu*0.4))/3;
}
void isPass()
{
    calcAverage();
    if(this.avg>55)
    {
        System.out.println(this.avg);
        System.out.println("Sinifi Gecti");
    }
    else{
        System.out.println(this.avg);

        System.out.println("Sinifta kaldi");
    }
}
    void sozluNotu(int Tarih,int Matematik,int Fizik)
    {
        if(0<=Tarih&&Tarih<=100)
        {
            this.Tarih.sozlu=Tarih;

        }
        if(0<=Fizik&&Fizik<=100)
        {
            this.Fizik.sozlu=Fizik;

        }
        if(0<=Matematik&&Matematik<=100)
        {
            this.Matematik.sozlu=Matematik;

        }


    }

}
