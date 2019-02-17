package spoj;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FLAMASTE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testsNumber = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < testsNumber; i++) {
            String line = scanner.nextLine();

            StringBuilder output = new StringBuilder();
            int currentSignCount = 1;
            char[] lineChars = line.toCharArray();
            char currentSign = lineChars[0];

            for (int j = 1; j < lineChars.length; j++) {
                if (lineChars[j] == currentSign) {
                    currentSignCount++;
                } else {
                    String outputPart = produceOutputPart(currentSignCount, currentSign);
                    output.append(outputPart);
                    currentSignCount = 1;
                    currentSign = lineChars[j];
                }
            }
            output.append(produceOutputPart(currentSignCount, currentSign));
            System.out.println(output.toString());
        }
    }

    private static String produceOutputPart(int count, char sign) {
        StringBuilder result = new StringBuilder();

        if (count > 2) {
            result.append(sign);
            result.append(count);
        } else {
            List<String> str = Collections.nCopies(count, String.valueOf(sign));
            result.append(String.join("", str));
        }

        return result.toString();
    }
}
