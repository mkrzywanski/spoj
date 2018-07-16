package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//Out of time, but results are correct
public class NWWNWW2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int testsNumber = Integer.valueOf(reader.readLine());

        for(int i = 0; i < testsNumber; i++) {
            Integer.valueOf(reader.readLine());
            String[] stringNumbers = reader.readLine().split(" ");

            int[] numbers = Arrays.stream(stringNumbers)
                    .mapToInt(Integer::parseInt)
                    .toArray();

            System.out.println(findNWW(numbers));
        }
    }

    private static int findNWW(int... numbers) {
        int nww = nww(numbers[0], numbers[1]);
        int counter = 2;

        while(counter < numbers.length) {
            nww = nww(nww, numbers[counter]);
            counter++;
        }

        return  nww;
    }

    private static int nwd(int a, int b) {
        int tmp;
        while(b != 0){
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    private static int nww(int a1, int a2) {
        return (a1 * a2) / nwd(a1, a2);
    }
}
