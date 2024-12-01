package pack2;
public interface Vehicles1
{
    interface Vehicle
    {
        void start();  // Method that must be implemented by any class or interface
        void stop();
    }

    // Child Interface extending Vehicle
    interface ElectricVehicles extends Vehicles {
        void charge();  // New method specific to ElectricVehicle
    }

}
class ElectricCar implements Vehicles1.ElectricVehicles
{

    @Override
    public void start() {
        System.out.println("Electric car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Electric car is stopping");
    }

    @Override
    public void charge() {
        System.out.println("Electric car is charging");
    }
}
