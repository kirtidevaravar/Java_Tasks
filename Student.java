class Stu
{
    int id;
    String  name;
 void displayinfo()
 {
     System.out.println("student_name :" +name );
     System.out.println("student_id :"+id);
 }
}

public class Student
{
        public static void main(String[] args)
        {
           Stu stu1=new Stu();
           stu1.name =  "kirti";
           stu1.id = 101;
            stu1.displayinfo();
        }

    }
