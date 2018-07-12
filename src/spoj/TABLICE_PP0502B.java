package spoj;

import java.util.Arrays;
import java.util.Scanner;

public class TABLICE_PP0502B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testsNumber = Integer.valueOf(scanner.nextLine());

        for(int i = 0; i < testsNumber; i++) {
            String[] stringNumbers = scanner.nextLine().split(" ");

            int[] numbers = Arrays.stream(stringNumbers)
                    .skip(1)
                    .mapToInt(Integer::parseInt)
                    .toArray();

            reverse(numbers);
            printArray(numbers);
        }
    }

    private static void reverse(int[] array) {
        for(int left = 0, right = array.length - 1; left < right; left++, right--) {
            array[left] += array[right];
            array[right] = array[left] - array[right];
            array[left] = array[left] - array[right];
        }
    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print(array[array.length-1]);
        System.out.print("\n");
    }
}
