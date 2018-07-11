package spoj;

import java.util.Scanner;

public class FCTRL3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testsNumber = Integer.valueOf(scanner.nextLine());

        for(int i = 0; i < testsNumber; i++) {
            int n = Integer.valueOf(scanner.nextLine());
            printAnswer(n);
        }
    }

    private static void printAnswer(int n) {
        switch (n) {
            case 0 :
            case 1 :
                System.out.println("0 1");
                break;
            case 2 :
                System.out.println("0 2");
                break;
            case 3 :
                System.out.println("0 6");
                break;
            case 4 :
                System.out.println("2 4");
                break;
            case 5 :
            case 6 :
            case 8 :
                System.out.println("2 0");
                break;
            case 7:
                System.out.println("4 0");
                break;
            case 9 :
                System.out.println("8 0");
                break;

                default :
                    System.out.println("0 0");
        }
    }
}
