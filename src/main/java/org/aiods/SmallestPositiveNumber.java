package org.aiods;

import java.util.Arrays;

import static java.lang.System.*;
import static java.util.stream.IntStream.iterate;

public class SmallestPositiveNumber {
    public static void main(String[] args) {
    int[] array = new int[]{1, 1,2,3};
        out.println(solution(array));
    }

   static public int solution(int[] input) {
        int[] sorted= Arrays.stream(input).sorted().toArray();
        var aa2= iterate(1, i -> i + 1)
               .filter(i -> Arrays.stream(sorted).noneMatch(input1 -> input1 == i))
               .findFirst()
               .orElse(1);

      // out.println(aa2);


        return aa2;
    }
}
