import java.util.Scanner;

public class FascinatingNumbers {
    public static final Scanner keyboard = new Scanner(System.in);
    public static final int MAX_INPUT = 10;
    public static final int STOP_INPUT = 0;


    public static void main(String[] args) {
        System.out.println("WEEK 6 - LAB 5");

        int index = 0;
        int[] inputNumbers = new int[MAX_INPUT];
        int count = calculateNumbersInput(inputNumbers);

        for (index = 0; index < count; index++) {
            if (isPrime(inputNumbers[index]) && isFibonacciNumber(inputNumbers[index])) {
                System.out.println(inputNumbers[index] + " is Fibonacci and is prime");
            } else if (isPrime(inputNumbers[index]) && (!isFibonacciNumber(inputNumbers[index]))) {
                System.out.println(inputNumbers[index] + " is Fibonacci and is not prime");
            } else if (!isPrime(inputNumbers[index]) && (isFibonacciNumber(inputNumbers[index]))) {
                System.out.println(inputNumbers[index] + " is not Fibonacci and is prime");
            } else {
                System.out.println(inputNumbers[index] + " is not Fibonacci and is not prime");
            }


        }


    } // End of the main class

    private static int calculateNumbersInput(int[] inputNumbers) {

        int index = 0;

        System.out.print("Please enter numbers (0 to stop): ");

        do {
            inputNumbers[index] = keyboard.nextInt();
            index++;

        } while ((inputNumbers[index - 1] != STOP_INPUT) && (index < inputNumbers.length));


        return index - 1;

    }

    private static boolean isPrime(int candidate) {

        int divisor = 2;

        while (divisor <= Math.sqrt(candidate)) {
            if (candidate % divisor == 0) {
                return (false);
            }
            divisor++;
        }
        return (true);
    } // End of is isPrime method

    private static boolean isFibonacciNumber(int number) {
        long previous = 1;
        long current = 0;
        long next;


        while (current < number) {

            next = current + previous;
            previous = current;
            current = next;

        }

        if (current == number) {
            return true;
        } else {
            return false;
        }


    } // End of isFibonacciNumber Class


} // End of the Fascinating Numbers Class
