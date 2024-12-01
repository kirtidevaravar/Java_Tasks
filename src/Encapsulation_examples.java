 class Student1 {
     private int age;
     private String name;

     //we are getter and setter the values of age
     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }
 }

public class Encapsulation_examples
{
   public static  void  main(String[] args)

   {
       Student1 s1=new Student1();
       s1.setAge(25);
       s1.setName("kirti");
       System.out.println("Age:"+ s1.getAge());
       System.out.println("Name:"+ s1.getName());


   }
}