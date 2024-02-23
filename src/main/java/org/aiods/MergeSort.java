package org.aiods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeSort {
    public static void main(String[] args) {
        int[] unsortedArr = new int[]{1, 4, 5, 2, 4, 5, 8};
        System.out.println(Arrays.toString(Arrays.stream(mergeSort(unsortedArr, 0, unsortedArr.length)).toArray()));
    }

    private static int[] mergeSort(int[] input, int start, int end) {

        if (end - start <= 1) {
            return getSliceOfArray(input,start,end);
        }

        ArrayList<Integer> resultList = new ArrayList<>();
        int leftPointer = 0, rightPointer = 0;
        int mid = (start + end) / 2;

        int[] left = mergeSort(input,start,mid);
        int[] right = mergeSort(input,mid,end);
         while (leftPointer < left.length || rightPointer < right.length ){

             if (leftPointer == left.length ){
                 resultList.add(right[rightPointer]);
                 rightPointer++;
             } else if (rightPointer == right.length) {
                 resultList.add(left[leftPointer]);
                 leftPointer++;
             } else if (left[leftPointer] <= right[rightPointer]) {
                 resultList.add(left[leftPointer]);
                 leftPointer++;
             }else{
                 resultList.add(right[rightPointer]);
                 rightPointer++;
             }
         }

//        return result;
    return resultList.stream().flatMapToInt(IntStream::of).toArray();

    }

    public static int[] getSliceOfArray(int[] arr,
                                        int start, int end)
    {

        // Get the slice of the Array
        int[] slice = new int[end - start];

        // Copy elements of arr to slice
        for (int i = 0; i < slice.length; i++) {
            slice[i] = arr[start + i];
        }

        // return the slice
        return slice;
    }
}
