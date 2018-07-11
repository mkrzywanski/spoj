package spoj;

import java.math.BigInteger;
import java.util.Scanner;

public class PRIME_T {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testsNumber = Integer.valueOf(scanner.nextLine());

        for(int i = 0; i < testsNumber; i++) {
            long number = scanner.nextLong();
            printAnswer(isPrime(number));
        }
    }

    private static boolean isPrime(long n) {
        return BigInteger.valueOf(n).isProbablePrime(100);
    }

    private static void printAnswer(boolean condition) {
        if (condition) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }
}
