package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.HashMap;

public class LESSTHAN {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(reader.readLine());

        long[] numbersArray = new long[n];
        Long number;

        for(int i = 0; i < n; i++) {
            number = Long.valueOf(reader.readLine());
            numbersArray[i] = number;
        }
        Arrays.sort(numbersArray);

        reader.readLine();
        int k = Integer.valueOf(reader.readLine());
        long[] iNumbers = new long[k];

        Long iNumber;
        Map<Long, Long> iValueCountMap = new HashMap<>();

        for(int i = 0; i < k; i++) {
            iNumber = Long.valueOf(reader.readLine());
            iNumbers[i] = iNumber;
        }

        long[] inumbersCopy = Arrays.copyOf(numbersArray, n);

        Arrays.sort(iNumbers);

        int index = 0;
        long counter = 0;
        Long currentInumber;

        for (int i = 0; i < k; i++) {
            currentInumber = iNumbers[i];
            for(int j = index; j < numbersArray.length; j++) {
                number = numbersArray[j];
                if(number < currentInumber) {
                    counter++;
                } else {
                    index = j;
                    iValueCountMap.put(currentInumber, counter);
                    break;
                }
            }
        }

        Long inumber;
        Long count;
        for (long anInumbersCopy : inumbersCopy) {
            inumber = anInumbersCopy;
            count = iValueCountMap.get(inumber);
            System.out.println(count);
        }
    }
}
