class Vehicle4
{
    public void type()
    {
        System.out.println("this is a generic vehicle:");
    }

    class Car1 extends Vehicle4
    {
        @Override
        public void type ()
        {
            System.out.println("this is a car:");
        }
    }

    class Bike1 extends Vehicle4

    {
        @Override
        public void type ()
        {
            System.out.println("this is bike:");
        }
    }

}

public class Methodoverdding1
{
    public static void main(String[] args)
    {
        Vehicle4 vehicle = new Vehicle4();
        vehicle.type();
       Vehicle4. Car1 car1= vehicle.new Car1();
        car1.type();
        Vehicle4 bike1= vehicle.new Bike1();
        bike1.type();
    }
}
