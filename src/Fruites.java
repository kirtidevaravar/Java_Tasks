public class Fruites
{
    String fruit_name;
    String color;
    int totalquantity;
    float pricePerKg;

    public float getPricePerKg()
    {
        System.out.println("fruit prices  per kg:200");
        return 0 ;
    }
    public static void main (String[] args)
    {
        Fruites f1=new Fruites();
        System.out.println("fruites name is:apple");
        System.out.println("fruites color is :red");
        System.out.println("totalquantity:20");
        f1.getPricePerKg();
    }
}

