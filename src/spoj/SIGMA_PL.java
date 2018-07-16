package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SIGMA_PL {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int testsNumber = Integer.valueOf(reader.readLine());

        long number;

        for(int i = 0; i < testsNumber; i++) {
            number = Long.valueOf(reader.readLine());

            System.out.println(calculateSigma(number));
        }
    }

    private static long calculateSigma(long number) {
        long sum = 1;
        int numberSqrt = (int)Math.sqrt(number);

        for(int i = 2; i <= numberSqrt; i++) {
            if (number % i == 0) {
                sum += i;
                long secondDivisor = number/i;
                if (i != secondDivisor) {
                    sum += secondDivisor;
                }
            }
        }

        if(number != 1) {
            sum += number;
        }

        return sum;
    }
}
