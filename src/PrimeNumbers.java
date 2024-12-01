import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        System.out.println("Prime numbers between 1 and 100 are:");

        // Loop through numbers from 2 to 100
        for (int num = 2; num <= 100; num++)
        {
            boolean isPrime = true;

            // Check if 'num' is divisible by any number from 2 to (num - 1)
            for (int i = 2; i < num; i++)
            {
                if (num % i == 0) {
                    isPrime = false; // 'num' is not prime
                    break;
                }
            }

            // If the number is prime, print it
            if (isPrime)
            {
                System.out.print(num + " ");
            }
        }
    }
}