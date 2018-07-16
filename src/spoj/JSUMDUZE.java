package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JSUMDUZE {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int testsNumber = Integer.valueOf(reader.readLine());

        BigInteger number1, number2;

        for(int i = 0; i < testsNumber; i++) {
            String[] numbers = reader.readLine().split(" ");

            number1 = new BigInteger(numbers[0]);
            number2 = new BigInteger(numbers[1]);

            System.out.println(number1.add(number2).toString());
        }
    }
}
