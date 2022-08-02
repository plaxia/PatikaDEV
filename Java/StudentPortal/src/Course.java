import java.util.Scanner;
public class Course
{
    Course Matematik;
    Course Tarih;
    Course Fizik;
    Teacher teacher;
    String name;
    int code ;
    String prefix;
    int note ;
    int sozlu ;
    Course(String name,int code, String prefix,Teacher teacher)
    {
this.name=name;
this.code=code;
this.prefix=prefix;
int note = 0;
int sozlu=0;
    }
   void addTeacher(Teacher t)
   {
if(this.prefix.equals(t.branch))
    this.teacher=t;
else
{
    System.out.println(t.name+"Akademisyeni bu dersi veremez");
}
   }
void printTeacher()
     {
         if(teacher!=null)
         {
             System.out.println("Name : "+teacher.name+ "Course : "+this.name);

         }
         else
         {
             System.out.println("İlgili derse atama yapılmamıştır");
         }
     }


    }
