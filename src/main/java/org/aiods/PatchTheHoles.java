package org.aiods;

import java.util.Arrays;

public class PatchTheHoles {
    public int solution(int[] x, int[] y, int w) {
        int noOfDrive=0;

        Arrays.sort(x);
        int i=0,j=0;
        while (i<x.length){
             int width= x[i] + w; //3 ,,1,2,2,4,6,7

             while (j<x.length && x[j] <= width){
                 j++;
             }
             i=j;
             noOfDrive++;

        }

        return noOfDrive;
    }
}
