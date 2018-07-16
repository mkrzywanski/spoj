package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DYZIO2 {

    private static int notPrimeMarker = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int testsNumber = Integer.valueOf(reader.readLine());

        int left, right;

        for(int i = 0; i < testsNumber; i++) {
            String[] stringNumbers = reader.readLine().split(" ");

            left = Integer.valueOf(stringNumbers[0]);
            right = Integer.valueOf(stringNumbers[1]);

            System.out.println(findPrimeNumbersCountInInterval(left, right));
        }
    }

    private static long findPrimeNumbersCountInInterval(int left, int right) {
        int[] array = new int[right - left + 1];

        for(int i = 0; i < array.length; i++) {
            array[i] = left + i;
        }

        for(int number = 2; number < Math.sqrt(right); number++) {
            for(int i=0; i < array.length; i++) {
                if(array[i] != notPrimeMarker && array[i] % number == 0) {
                    array[i] = notPrimeMarker;
                }
            }
        }

        int counter = 0;
        for(int num: array) {
            if(num != notPrimeMarker) {
                counter++;
            }
        }
        return counter;
        //return Arrays.stream(array).filter(number -> number != -1 && number >= left && number <= right).count();
    }
}
