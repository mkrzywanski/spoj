package spoj;

import java.util.Scanner;

public class KC008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long overallSum = 0;
        long partSum = 0;

        while(scanner.hasNextLong()){
            long number = scanner.nextLong();
            if(number == 0){
                System.out.println(partSum);
                overallSum = overallSum + partSum;
                partSum = 0;
            }
            partSum = partSum + number;

        }
        System.out.println(overallSum);
    }
}
