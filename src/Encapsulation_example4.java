class Car3
{
    private String brand;
    private int speed;

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
}
public class Encapsulation_example4
{
    public static void main(String[] args)
    {
        Car3 c1=new Car3();
        c1.setBrand("nexon");
        c1.setSpeed(100);
        System.out.println("carbrand:"+c1.getBrand());
        System.out.println("carspeed:"+c1.getSpeed());

    }
}
