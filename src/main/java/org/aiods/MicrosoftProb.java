package org.aiods;

import java.util.Arrays;
import java.util.HashMap;

public class MicrosoftProb {
    public static void main(String[] args) {
//        System.out.println(solution("QABAAAWOBL"));


        System.out.println(solution1(new int[]{2, 4, 2, 6, 7, 1},new int[]{0, 5, 3, 2, 1},2));
    }

    public static int solution1(int[] X, int[] Y, int W) {
        int[] xSorted= Arrays.stream(X).sorted().toArray();//[1,2,2,4,6,7],//W =roller size=2,[0,1,2,3,5]
        int drivesCount=0;
        int i=0;
        while (i<xSorted.length ) {
            int width = xSorted[i] + W;
            int j = i;
            while (j < xSorted.length && xSorted[j] <= width) {
                j++;
            }
            i = j;
            drivesCount++;
        }
        return  drivesCount;
    }
    static public int solution(String S) {

        var map=new HashMap<Character,Integer>();
        for (int i=0;i<S.length();i++){
            Character ch=S.charAt(i);
            if (ch=='N' |ch=='A'|ch=='B' ){
                if (map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                }else {
                    map.put(ch,1);

                }
            }
        }
        int counter=0;
        while (true){

            if ((map.containsKey('B') && map.containsKey('N')
                    && map.containsKey('A') )
                    && map.get('B')>=1 &&
                    map.get('A')>=3 &&
                    map.get('N')>=2  ){
                map.put('B',map.get('B')-1);
                map.put('A',map.get('A')-3);
                map.put('N',map.get('N')-2);
                counter++;
            }else {
                break;
            }

        }
        return  counter;
    }
}
