package spoj;

import java.util.Scanner;

public class PA05_POT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testsNumber = Integer.valueOf(scanner.nextLine());

        for(int i = 0; i < testsNumber; i++) {
            String[] numbers = scanner.nextLine().split(" ");

            int a = Integer.valueOf(numbers[0]);
            int b = Integer.valueOf(numbers[1]);

            System.out.println(lastDigit(a, b));
        }
    }

    private static int lastDigit(int base, int exponent) {
        String baseString = String.valueOf(base);
        int baseLastDigit = baseString.charAt(baseString.length() - 1) - '0';
        int mod = exponent % 4;
        exponent = (mod == 0) ? 4 : mod;
        int lastDigit = (int)Math.pow(baseLastDigit , exponent);
        return  lastDigit % 10;
    }
}
