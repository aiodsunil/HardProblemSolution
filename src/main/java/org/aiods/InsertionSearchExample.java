package org.aiods;

import java.util.Arrays;

public class InsertionSearchExample {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Arrays.stream(insertionSort(new int[]{1, 4, 5, 2, 4, 5, 8})).toArray()));
    }

    private static int[] insertionSort(int[] input) {

        for (int i = 0; i < input.length ; i++) {
            int j=i;
            while (j>0 && input[j]<input[j-1]){

                 int temp=input[j];
                 input[j]=input[j-1];
                 input[j-1]= temp;
                 j--;
            }

        }

        return  input;
    }
}
