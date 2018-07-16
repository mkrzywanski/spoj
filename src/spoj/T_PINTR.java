package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class T_PINTR {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x1, y1, x2, y2, x3, y3 , px, py, eq1, eq2, eq3;
        String line;
        do {
            line = reader.readLine();
            if(line.equals("0 0 0 0 0 0 0 0")) {
                break;
            }
            String[] stringNumbers = line.split(" ");

            int[] numbers = Arrays.stream(stringNumbers)
                    .mapToInt(Integer::parseInt)
                    .toArray();


            x1 = numbers[0];
            y1 = numbers[1];

            x2 = numbers[2];
            y2 = numbers[3];

            x3 = numbers[4];
            y3 = numbers[5];

            px = numbers[6];
            py = numbers[7];

            eq1 = (y1 - y2) * px + (x2 - x1) * py + (x1 * y2 - y1 * x2);
            eq2 = (y2 - y3) * px + (x3 - x2) * py + (x2 * y3 - y2 * x3);
            eq3 = (y3 - y1) * px + (x1 - x3) * py + (x3 * y1 - y3 * x1);

//            eq1 = (px - x1)*(y2 - y1) - (py - y1)*(x2 - x1);
//            eq2 = (px - x2)*(y3 - y2) - (py - y2)*(x3 - x2);
//            eq3 = (px - x3)*(y1 - y3) - (py - y3)*(x1 - x3);

            printAnswer(eq1, eq2, eq3);
        } while (true);
    }


    private static void printAnswer(int eq1, int eq2, int eq3) {
        if((eq1 > 0 && eq2 > 0 &&  eq3 > 0) || (eq1 < 0 && eq2 < 0 &&  eq3 < 0)) {
            System.out.println("I");
        } else if (eq1 == 0 || eq2 == 0 ||  eq3 == 0) {
            System.out.println("E");
        } else {
            System.out.println("O");
        }
    }
}
