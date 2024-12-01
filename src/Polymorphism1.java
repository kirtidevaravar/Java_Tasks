public class Polymorphism1
{
    //add two integers
    public int add(int a,int b)
    {
        return  a+b;
    }

    //add three  doubles
    public double add(double a,double b,double c)
    {
        return  a+b+c;
    }

    //add two floats
    public  float add(float a,float b)
    {
        return a+b;
    }

    public static void main(String[] args)
    {
        Polymorphism1 polymorphism1=new Polymorphism1();
        System.out.println("adding two interger:"+polymorphism1.add(2,3));
        System.out.println("adding three doubles:"+polymorphism1.add(4,1,2));
        System.out.println("adding two floats:"+polymorphism1.add(3,1,4));
    }
}
