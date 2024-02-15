package org.aiods;

import java.util.Arrays;

/*
Understanding the problem
Given an array of distinct integers and an integer representing the target sum,
we are asked to implement a function that is going to find out whether
there's a pair of numbers in the array that adds up to the target sum.
 If such pair exists, return the pair in any order; otherwise return an empty array.
  We cannot add a number to itself to get the target sum.


 */
public class TwoNumberSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getTwoNumSum(new int[]{4, 1, 2, 4, 5, 6}, 3)));
    }
    static  int[] getTwoNumSum(int[] array,int targetSum){
        int[] sumArray= new int[2];
        for (int i = 0; i < array.length; i++) {
             int ai=array[i];
            for (int j = i+1; j <array.length ; j++) {
               int aj= array[j];
               if (ai+aj==targetSum){
                     sumArray[0]=ai;
                     sumArray[1]=aj;
                   return sumArray;
               }
            }
            
        }
        return  sumArray;
    }
}
