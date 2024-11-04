import java.util.Scanner;

public class Calculator
{
    public static void  main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the first number:");
        double num1 = s1.nextDouble();
        System.out.println("enter the second number:");
        double num2=s1.nextDouble();
        System.out.println("enter an operations: +,-,*,/" ) ;
        char operation=s1.next().charAt(0);
        double result=0;

        //operation
        switch (operation)
        {
            case '+' :
                result = num1+num2;
                break;
            case '-' :
                result = num1-num2;
                break;
            case '*' :
                result = num1*num2;
                break;
            case '/':
                if(num2!=0)
                {
                result =  num1/num2;
                }
                else
                {
                    System.out.println("error division by zero is not allowed");
                    s1.close();
                    return;
                }
                break;
            default:
                System.out.println("invalid operation.please choose +,-,* or /");
                s1.close();
                return;
        }
           //display operation
        System.out.println("the result is:" +result);
        s1.close();
    }
}
