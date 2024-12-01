public class Polymorphism
{
    //perimeter of square
    public int perimeter(int a)
    {
        return 4 * a;
    }
    //perimeter of  rectangle
    public int perimeter(int length,int width)
    {
        return 2 * (length + width);
    }
    public  int tringle(int a,int b,int c)
    {
        return  a+b+c;

    }
    public static void main (String[] args)
    {
        Polymorphism p1=new Polymorphism();
        System.out.println("perimeter of square:"+p1.perimeter(2));
       System.out.println("perimeter of rectangle:"+ p1.perimeter(3,4));
        System.out.println("perimeter of triangle:"+p1.tringle(1,4,5));
    }



}

