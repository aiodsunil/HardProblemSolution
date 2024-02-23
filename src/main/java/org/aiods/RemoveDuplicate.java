package org.aiods;

import java.util.Arrays;

public class RemoveDuplicate {


    public static void main(String[] args) {
        int[] a= new int[]{0, 0, 1, 1, 1, 2, 2};
        System.out.println(removeDuplicates(a));
    }
   static  int removeDuplicates(int[] input){
       int slow=0;
       for (int fast = 1; fast <input.length; fast++) {

           if (input[fast]!=input[fast-1]){
               slow++;
               input[slow]=input[fast];
           }

       }
       System.out.println(Arrays.toString(Arrays.stream(input).toArray()));
       return  slow+1;
   }
}
