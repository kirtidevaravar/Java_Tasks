public class Person {
    String name="vidyut";
    int age=25;
    char gender='M';
    float height=5.2f;

    public void getgender() {
        System.out.println("gender:" + gender);
    }

    public void getheight() {
        System.out.println("height:" + height);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name);
        System.out.println(p1.age);
        p1.getgender();
        p1.getheight();
    }
}
