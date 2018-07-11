package spoj;

import java.util.Arrays;
import java.util.Scanner;

public class TABLICE_PP0502B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testsNumber = Integer.valueOf(scanner.nextLine());

        for(int i = 0; i < testsNumber; i++) {
            String[] stringNumbers = scanner.nextLine().split(" ");

            Integer[] numbers = Arrays.stream(stringNumbers)
                    .skip(1)
                    .map(Integer::valueOf)
                    .toArray(Integer[]::new);

            swap(numbers);
            printArray(numbers);
        }
    }

    private static void swap(Integer[] tab) {
        for(int left = 0, right = tab.length - 1; left < right; left++, right--) {
            tab[left] += tab[right];
            tab[right] = tab[left] - tab[right];
            tab[left] = tab[left] - tab[right];
        }
    }

    private static void printArray(Integer tab[]) {
        for(int i = 0; i < tab.length - 1; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.print(tab[tab.length-1]);
        System.out.print("\n");
    }
}
