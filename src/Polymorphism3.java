public class Polymorphism3
{
    //creating student name
    public void display(String name)
    {
        System.out.println("student name is:"+name);
    }
    // creating student name and age
    public  void display(String name,int age)
    {
        System.out.println("Student name is:"+name);
        System.out.println("Student age is :"+age);
    }
    //creating student name,age and grade
    public  void display (String name,int age,char grade)
    {
        System.out.println("Student name is:"+name);
        System.out.println("Student age is :"+age);
        System.out.println("student grade is:"+grade);
    }
    public static void main(String[] args)
    {
        Polymorphism3 polymorphism3=new Polymorphism3();
        polymorphism3.display("sona");
        polymorphism3.display("vidyut",2);
        polymorphism3.display("siddu",28,'A');

    }
}
