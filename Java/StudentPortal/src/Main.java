public class Main
{
    public static void main(String[] args)
    {
Teacher t1 = new Teacher("Ali","TRH",555);
Teacher t2 = new Teacher("Ahmet","FZK",000);
Teacher t3 = new Teacher("Mehmet","MAT",505);
Course Tarih = new Course("Tarih",101,"TRH",t1) ;
Course Fizik = new Course("Fizik",102,"FZK",t2) ;
Course Matematik = new Course("Matematik",103,"MAT",t3) ;
Student s1 = new Student("Şaban",123,4,Tarih,Fizik,Matematik);
t1.print();
s1.addBulkExamNote(60,60,60);
s1.printNote();
s1.sozluNotu(50,50,50);
s1.isPass();
    }
}
