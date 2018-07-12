package spoj;

import java.util.Scanner;

public class VSR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testsNumber = Integer.valueOf(scanner.nextLine());

        for(int i = 0; i < testsNumber; i++) {
            String[] numbers = scanner.nextLine().split(" ");

            int v1 = Integer.valueOf(numbers[0]);
            int v2 = Integer.valueOf(numbers[1]);

            System.out.println(mean_velocity(v1, v2));
        }
    }

    private static int mean_velocity(int v1, int v2) {
        return 2 * v1 * v2 / (v1 + v2);
    }
}
