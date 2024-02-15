package org.aiods;

import java.util.Arrays;

public class RemoveDuplicateElementFromIntArray {
    public static void main(String[] args) {
       int[] a={1,2,3,4,1,2};//input array of int
     //  int[] result = {1,2,3,4};//remove duplicate number from array
        int[] result = new int[a.length];

        for (int i=0; i<a.length;i++){
             int element=a[i];
            if (!isExist(result,element))
            {
                result[i]=element;
            }
        }

        for (int num:result) {
            System.out.println(num);

        }

    }
    static  boolean isExist(int[] result ,int element){
             if (Arrays.stream(result).anyMatch(value -> value==element)){
                 return  true;
             }else{
                 return false;
             }
    }
}