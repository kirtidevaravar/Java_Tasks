package pack2;

public class Main1
{
    public static void main(String[] args)
    {
        Vehicles1.ElectricVehicles myCar = new ElectricCar();
        myCar.start();  // Output: Electric car is starting
        myCar.stop();   // Output: Electric car is stopping
        myCar.charge(); // Output: Electric car is charging
    }
}
