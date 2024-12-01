public class Book
{
    String title;
    String author;
    int pages;

        public int getPages()
        {
            System.out.println("book pages display:500");
            return 0 ;
        }

    public static void main (String[] args)
    {
        Book b1=new Book();
       System.out.println("title name is:Harry potter");
       System.out.println("author is :J.k.Rowling");
       //System.out.println("pages:500");
       b1.getPages();

    }

}
