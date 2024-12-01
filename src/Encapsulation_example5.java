class Book1
{
    private String title;
    private String author;
    private double prices;

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public double getPrices()
    {
        return prices;
    }

    public void setPrices(double prices)
    {
        this.prices = prices;
    }
}
public class Encapsulation_example5
{
    public static void main(String[] args)
    {
        Book1 b1=new Book1();
        b1.setTitle("java");
        b1.setAuthor("james gosling");
        b1.setPrices(300.0);
        System.out.println("title:"+b1.getTitle());
        System.out.println("Author:"+b1.getAuthor());
        System.out.println("price:"+b1.getPrices());
    }
}
