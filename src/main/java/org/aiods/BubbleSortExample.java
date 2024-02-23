package org.aiods;

import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Arrays.stream(bubbleSort(new int[]{1, 4, 5, 2, 4, 5, 8})).toArray()));
    }

    private static int[] bubbleSort(int[] input) {

        for (int i = input.length-1; i > 0; i--) {
            boolean pass=false;
            for (int j = 0; j < i; j++) {
                if (input[j] >input[j+1]) {
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                    pass=true;
                }
            }



          if (!pass){
              return  input;
          }
        }

        return input;
    }
}
