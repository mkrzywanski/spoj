package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MWPZ06Z {
    public static void main(String[] args) throws IOException  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int testsNumber = Integer.valueOf(reader.readLine());

        for(int i = 0; i < testsNumber; i++) {
            String[] stringNumbers = reader.readLine().split(" ");

            printAnswer(modulo(stringNumbers[1], stringNumbers[0]));
        }
    }

    private static void printAnswer(int mod) {
        if(mod == 0) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }

    private static int modulo(String stringNumber1, String stringNumber2) {
        int number;
        int num2 = Integer.valueOf(stringNumber2);
        int mod = (stringNumber1.charAt(0) - '0') % num2;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(mod));

        for(int i = 1; i < stringNumber1.length(); i++) {
            stringBuilder.append(stringNumber1.charAt(i));
            number = Integer.valueOf(stringBuilder.toString());
            mod = number % num2;
            stringBuilder.setLength(0);
            stringBuilder.append(mod);
        }

        return mod;
    }
}
