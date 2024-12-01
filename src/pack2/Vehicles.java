package pack2;
public interface Vehicles
{
    public void start();
    public void stop();
}
interface ElectricVehicle extends Vehicles
{
    void charge(); // New method specific to Electric vehicles
}
abstract class Car implements Vehicles
{
    @Override
    public void start()
    {
        System.out.println("car is starting");
    }
}
class  Bikes extends Car implements ElectricVehicle
{
    public void stop()
    {
        System.out.println("bike is stopping");
    }

    @Override
    public void charge()
    {
        System.out.println("electric car is charging");
    }
}