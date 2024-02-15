package org.aiods;

import java.util.ArrayList;
import java.util.Arrays;

public class Findallpairswithgivensum {
    public static void main(String[] args) {
        Pair[] pairs=allPairs(new long[]{1, 2, 4, 5, 7},new long[]{5, 6, 3, 4, 8},5,5,9);
        System.out.println(pairs);
    }

    public static Pair[] allPairs( long A[], long B[], long N, long M, long X) {
        Arrays.sort(A);
        Arrays.sort(B);
        ArrayList<Pair> pairs= new ArrayList<>();
        for (int i=0;i<N;i++){
            for (int j = 0; j <M ; j++) {
                if (A[i]+B[j]==X){
                    Pair pair =new Pair(A[i],B[j]);
                    pairs.add(pair);
                }

            }
        }

        Pair[] pairs1=new Pair[pairs.size()];
        for (int p = 0; p <pairs.size() ; p++) {
            pairs1[p]=pairs.get(p);


        }
        return  pairs1;
    }
}
class Pair  {
    long first, second;
    public Pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
