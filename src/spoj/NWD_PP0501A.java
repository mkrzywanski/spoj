package spoj;

import java.util.Scanner;

public class NWD_PP0501A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testsNumber = Integer.valueOf(scanner.nextLine());

        for(int i = 0; i < testsNumber; i++) {
            String[] numbers = scanner.nextLine().split(" ");

            int a = Integer.valueOf(numbers[0]);
            int b = Integer.valueOf(numbers[1]);

            System.out.println(nwd(a, b));
        }
    }

    private static int nwd(int a, int b) {
        if (b == 0) {
            return a;
        }
        else {
            return nwd(b, a % b);
        }
    }
}
