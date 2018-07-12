package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JPESEL {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int testsNumber = Integer.valueOf(reader.readLine());

        for(int i = 0; i < testsNumber; i++) {
            int[] digits = reader.readLine().chars().map(sign -> sign - '0').toArray();
            boolean isValid = new Pesel(digits).validate();
            printAnswer(isValid);
        }
    }

    private static class Pesel {
        private int[] digits;

        private Pesel(int[] digits) {
            this.digits = digits;
        }

        private boolean validate() {
            long overallSum = 0;

            overallSum += digits[0];
            overallSum += digits[1] * 3;
            overallSum += digits[2] * 7;
            overallSum += digits[3] * 9;
            overallSum += digits[4];
            overallSum += digits[5] * 3;
            overallSum += digits[6] * 7;
            overallSum += digits[7] * 9;
            overallSum += digits[8];
            overallSum += digits[9] * 3;
            overallSum += digits[10];

            String sumString = String.valueOf(overallSum);

            return sumString.charAt(sumString.length() - 1) == '0';
        }
    }

    private static void printAnswer(boolean condition) {
        if(condition) {
            System.out.println("D");
        } else {
            System.out.println("N");
        }
    }
}
