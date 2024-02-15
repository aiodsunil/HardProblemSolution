package org.aiods;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumberSimple(new int[]{1, 2, 3, 5}, 5));
        System.out.println(missingNumber(new int[]{1, 2, 3, 5}, 10));
    }

    static int missingNumber(int array[], int n) {
        return IntStream.range(1, n).filter(i -> Arrays.stream(array).noneMatch(input -> input == i))
                .findFirst().orElse(1);

    }

   static  int missingNumberSimple(int[] arr,int limit){
        int missingNum=1;
        for (int i =1;i<limit;i++){
            if (arr.length>=limit-1 && arr[i-1]!=i){
                   missingNum=i;
            }

        }
        return  missingNum;
   }
}
