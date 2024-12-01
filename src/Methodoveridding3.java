import javafx.scene.shape.Shape;

class Shape1
{
    public void draw()
    {
        System.out.println("Drawing generic shape");
    }
}
     class Circle extends Shape1
     {
         public  void draw()
         {
             System.out.println("Drawing circle");
         }
     }
     class Triangle1 extends Shape1
     {
         @Override
         public void draw()
         {
             System.out.println("Drawing triangle");
         }
     }
     class Rectangle extends Shape1
     {
         @Override
         public void draw()
         {
             System.out.println("Drawing Rectangle");
         }
     }

public class Methodoveridding3
{
    public static void main(String[] args)
    {
        Shape1 shape1=new Shape1();
        shape1.draw();
        Shape1 Circle =new Circle();
        Circle.draw();
        Shape1 Triangle1=new Triangle1();
        Triangle1.draw();
        Shape1 Rectangle=new Rectangle();
        Rectangle.draw();

    }

}
