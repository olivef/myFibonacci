import java.util.Scanner;
import java.util.InputMismatchException;
import java.math.BigInteger;

public class Fibo {

    public static void calculate_fibonacci(long n) {
        if (n == 0) {
            System.out.println("0");
        } else {
            BigInteger a = BigInteger.ZERO;
            BigInteger b = BigInteger.ONE;
            System.out.println("0" + "\n" + "1");
            while (n > 2) {
                BigInteger nextElement = a.add(b);
                System.out.println(nextElement);
                a = b;
                b = nextElement;
                n--;
            }
        }
    }

    public static void main(String[] args) {

        System.out.print("Please enter the value of n: ");
        try {
            Scanner s = new Scanner(System.in);
            long n = s.nextLong();
            s.close();
            calculate_fibonacci(n);

        } catch (InputMismatchException e) {
            System.out.println("Please type a number");
        }

    }

}