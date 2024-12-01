package pack2;
public abstract class Isport implements Sports
{
    @Override
    public void indoor()
    {
        System.out.println("playing indoor games like chess");
    }

    @Override
    public void outdoor()
    {
        System.out.println("playing outdoor games like football");
    }
static class Mysports extends Isport
{

}
public static void main(String[] args) {
    Sports sports = new Mysports();
    sports.indoor();
    sports.outdoor();

}
}