package org.aiods;

import java.util.Arrays;

public class NPothHoles {
    public static void main(String[] args) {
        int [] x = new int[]{2,4,2,6,7,1};//{1,2,2,4,6,7}
        int [] y = new int[]{0,5,3,2,1,5};
        int result = noOfDrives(x,y,2);//w=2 result should be 3
        System.out.println(result);
    }

    private static int noOfDrives(int[] x, int[] y, int w) {
        int[] sortedX= Arrays.stream(x).sorted().toArray();
        int i=0;
        int noOfDrive=0;
        while (i<sortedX.length){
            int rollerWidth= sortedX[i]+w;
            int j=0;
            while (j<sortedX.length && sortedX[j]<=rollerWidth){
                j++;
            }
            i=j;
            noOfDrive++;
        }

        return  noOfDrive;
    }
}
