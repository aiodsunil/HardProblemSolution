package org.aiods;

import java.util.Arrays;

public class SelectionSearchExample {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Arrays.stream(selectionSort(new int[]{1, 4, 5, 2, 4, 5, 8})).toArray()));
    }

    private static int[] selectionSort(int[] input) {

        for (int i = 0; i < input.length; i++) {
            int min = i;
            for (int j = i; j < input.length; j++) {

                if (input[j] < input[min]) {
                    min = j;
                }
            }
                int temp = input[i];
                input[i] = input[min];
                input[min] = temp;


        }

        return input;
    }
}
