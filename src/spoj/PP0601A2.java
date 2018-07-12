package spoj;

import java.util.Scanner;

public class PP0601A2 {
    private static int endSign = 42;

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        System.out.println(firstNumber);

        int secondNumber;
        int sequenceCounter = 0;

        while(scanner.hasNextInt()){
            secondNumber = scanner.nextInt();
            System.out.println(secondNumber);

            if(checkSequence(firstNumber, secondNumber)) {
                sequenceCounter++;
            }

            if(sequenceCounter == 3) {
                break;
            }
            
            firstNumber = secondNumber;
        }
    }

    private static boolean checkSequence(int a, int b) {
        return a != endSign && b == endSign;
    }
}
