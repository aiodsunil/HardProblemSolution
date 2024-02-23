package org.aiods;

import java.util.Arrays;

public class TwoSumOfTarget {

    public static void main(String[] args) {
        int[] arrayIndex=twoSum(new int[]{1,7,11,1,8},9);
        System.out.println(Arrays.toString(arrayIndex));
    }

    private static int[] twoSum(int[]a , int target) {
        for (int i = 0; i <a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]+a[j]==target){
                    return new int[]{i,j};
                }

            }

        }
        return new int[]{};
    }
}
