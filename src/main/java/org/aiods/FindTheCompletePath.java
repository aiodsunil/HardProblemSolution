package org.aiods;

public class FindTheCompletePath {

    public static void main(String[] args) {
     // System.out.println(findThePath(new int[]{3, 2, 0, 1, 3, 1, 2, 0, 0}));
        System.out.println(findThePath(new int[]{2, 6, 5, 4, 2,1, 0, 0}));
    }

    private static boolean findThePath(int[] input) {
         int j=0;
        for (int i = 0; i < input.length; i++) {
            int value = input[j];
            if (value>=input.length){
                return  true;
            }else if (value>=(input.length-i+1)){
                return  true;
            }

            else if (value>0 && (input[j+1]<value) ) {
                j=j+value;

            }

            else if (input[j - 1] > 0 && i + input[j - 1] == input.length) {
                return true;
            }


        }
        return false;
    }
}
