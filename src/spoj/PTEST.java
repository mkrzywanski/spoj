package spoj;

import java.io.IOException;
import java.util.Scanner;

public class PTEST {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(firstNumber + secondNumber);
    }
}
