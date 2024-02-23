package org.aiods;

import java.util.Arrays;
import java.util.List;

public class TwoSumSorted {


    public static void main(String[] args) {
        int[] a=new int[]{2 ,3, 4 ,5 ,8, 11 ,18};
        int target=8;
        System.out.println(Arrays.toString(Arrays.stream(twoSumSortedSum(a, target)).toArray()));
    }

    private static int[] twoSumSortedSum( int[] input, int target) {
       int slow=0;
       int fast=input.length-1;
        for (int i = input.length-1; i >0 ; i--) {
            int sum=input[slow]+input[fast];
            if (sum>target){
                fast--;
            }else if (sum<target){
                slow++;
            }else {
                return  new int[]{slow,fast};
            }

        }
        return  new int[]{};
    }

    public static List<Integer> twoSumSorted(List<Integer> arr, int target) {
        int slow=0;
        int fast=arr.size()-1;
        for (int i = arr.size()-1; i >0 ; i--) {
            int sum=arr.get(slow)+arr.get(fast);
            if (sum>target){
                fast--;
            }else if (sum<target){
                slow++;
            }else {
                return  List.of(slow,fast);
            }

        }
        return List.of();
    }
}
