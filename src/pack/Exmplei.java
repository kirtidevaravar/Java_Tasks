package pack;
public class Exmplei implements House,Personinfo,laptop,Book4,Vegitables
{
    @Override
    public void hall()
    {
        System.out.println("this is hall");
    }

    @Override
    public void kitchen() {
        System.out.println("this is kitchen");
    }

    @Override
    public void room() {
        System.out.println("this is room");
    }

    @Override
    public void name(String name) {
        System.out.println("student name is:"+name);
    }

    @Override
    public void age(int age) {
        System.out.println("student age:"+age);
    }

    @Override
    public void contact(String contact) {
        System.out.println("student contact:"+contact);
    }

    @Override
    public void type()
    {
        System.out.println("the laptop type is dell");
    }

    @Override
    public void poweron()
    {
        System.out.println("the laptop is poweron");
    }

    @Override
    public void poweroff()
    {
        System.out.println("the laptop is poweroff");

    }

    @Override
    public void title()
    {
        System.out.println("the book title is java");
    }

    @Override
    public void author()
    {
        System.out.println("the  book author name is james gosling");

    }

    @Override
    public void prices()
    {
        System.out.println("the book prices is 400");
    }
    @Override
    public void vegitablePotato()
    {
        System.out.println("the vegitable name is potato");
    }
    @Override
    public void vegitableOnion()
    {
        System.out.println("the vegitable name is onion");

    }
    @Override
    public void vegitableChili()
    {
        System.out.println("the vegitable name is chili");

    }
    public static void main(String[] args)
    {
        Exmplei h1 = new Exmplei();
        System.out.println("house details");
        h1.hall();
        h1.kitchen();
        h1.room();
        System.out.println("person Information");
        h1.name("vidyut");
        h1.age(25);
        h1.contact("+98444");
        System.out.println("laptop details");
        h1.type();
        h1.poweron();
        h1.poweroff();
        System.out.println("the book details");
        h1.title();
        h1.author();
        h1.prices();
        System.out.println("the vegitable details");
        h1.vegitablePotato();
        h1.vegitableOnion();
        h1.vegitableChili();
    }
}
