package spoj;

import java.util.Scanner;

public class RNO_DOD {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        int testsNumber = Integer.valueOf(scanner.nextLine());

        int numbersAmount;
        int sum;
        for(int i = 0; i < testsNumber; i++) {
            numbersAmount = Integer.parseInt(scanner.nextLine());

            String[] numbers = scanner.nextLine().split(" ");
            sum = 0;
            for(int numberIndex = 0; numberIndex < numbersAmount; numberIndex++) {
                sum += Integer.valueOf(numbers[numberIndex]);
            }

            System.out.println(sum);
        }
    }
}
