package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VSR {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int testsNumber = Integer.valueOf(reader.readLine());

        int v1,v2;

        for(int i = 0; i < testsNumber; i++) {
            String[] numbers = reader.readLine().split(" ");

            v1 = Integer.valueOf(numbers[0]);
            v2 = Integer.valueOf(numbers[1]);

            System.out.println(mean_velocity(v1, v2));
        }
    }

    private static int mean_velocity(int v1, int v2) {
        return 2 * v1 * v2 / (v1 + v2);
    }
}
