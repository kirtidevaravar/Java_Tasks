public class Operators
{
    public static  void main (String[] args)
    {
        //arithmetic operators
        int a=10;
        int b=50;
        int c =a+b;
        System.out.println("add :"+c);
         c =a-b;
         System.out.println("sub:"+c);
         System.out.println("mul:"+(a*b));
         System.out.println("div:"+(a/b));
         System.out.println("mod:"+(a%b));
         System.out.println("increment:"+(a++));
         System.out.println("value of :"+a);
         System.out.println("decrement:"+(--b));
       //  System.out.println("value of :"+b);
     //relational operators
        System.out.println("a==b:" +(a==b)); //equal to ==
        System.out.println(("a!=b")); //not equal !=
        System.out.println("a>b:"+(a>b)); //greterthan >
        System.out.println("a<b:"+(a<b)); //lessthan <
        System.out.println("a>=b:"+(a>=b)); //>=
        System.out.println("a<=b:"+(a<=b)); //<=

     //logical operator
        if(a>5 && b>15)
        {
            System.out.println("both condtions are true:+(a>10 and b>50)"); //and
        }
        if(a>5 || b>15)
        {
            System.out.println("at least one condition is true:"+(a>5 || b>15)); //or
        }
     //assignment operator
        a += 5;       // a = a + 5
        System.out.println("After a += 5: " + a);        // a = 15
        a -= 3;       // a = a - 3
        System.out.println("After a -= 3: " + a);        // a = 12

        a *= 2;       // a = a * 2
        System.out.println("After a *= 2: " + a);        // a = 24

        a /= 4;       // a = a / 4
        System.out.println("After a /= 4: " + a);        // a = 6

        a %= 5;       // a = a % 5
        System.out.println("After a %= 5: " + a);        // a = 1
     //special operator ? :(ternery operator) condition ? expressionIfTrue : expressionIfFalse;
        int max = (a > b) ? a : b;   // If a > b, max is a, otherwise max is b
        System.out.println("Max is: " + max);
        //bitwise operators
        // Bitwise AND (&)
        int andresult = a & b;  // binary: 0001, decimal: 1
        System.out.println("a & b = " + andresult);
        // Bitwise OR (|)
        int orResult = a | b;   // binary: 0111, decimal: 7
        System.out.println("a | b = " + orResult);

        // Bitwise XOR (^)
        int xorResult = a ^ b;  // binary: 0110, decimal: 6
        System.out.println("a ^ b = " + xorResult);

        // Bitwise NOT (~)
        int notResult = ~a;     // binary: 1010 (two's complement), decimal: -6
        System.out.println("~a = " + notResult);

        // Left Shift (<<)
        int leftShift = a << 1; // binary: 1010, decimal: 10
        System.out.println("a << 1 = " + leftShift);

        // Right Shift (>>)
        int rightShift = a >> 1; // binary: 0010, decimal: 2
        System.out.println("a >> 1 = " + rightShift);




    }

}
