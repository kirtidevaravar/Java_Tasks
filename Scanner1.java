import java.util.Scanner;

public class Scanner1
{
    public static  void  main (String[]args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the value a");
        int a= s1.nextInt();
        System.out.println("enter the value b");
        int b= s1.nextInt();
        int sum =a+b;
        System.out.println("sum of a and b values :" +sum);

    }
}
