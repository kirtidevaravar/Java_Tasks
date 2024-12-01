class Animal
{
    public void sound()
    {
        System.out.println("Animals make sound");
    }
}
    class Dog extends Animal
    {
        @Override
        public void sound()
        {
            System.out.println("dog barks");
        }

    }
    class Cat extends Animal1
    {
        @Override
        public void sound()
        {
            System.out.println("Cat make memow");
        }
    }

public class Methodovveriding
{
    public static void main(String[] args)
    {
        Animal animal=new Animal();
        animal.sound();
        Dog dog=new Dog();
        dog.sound();
        Cat cat=new Cat();
        cat.sound();
    }

}
