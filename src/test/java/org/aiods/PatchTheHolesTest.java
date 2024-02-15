package org.aiods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PatchTheHolesTest {
//X = [2, 4, 2, 6, 7,1], Y = [0, 5, 3, 2, 1, 5] and W = 2, the answer is 3

    @Test
    void  minimumDriveNeeded(){
       int[] X = new int[]{2, 4, 2, 6, 7,1};
       int[] Y = new int[]{0, 5, 3, 2, 1, 5};
       int W=2;
       var patchTheHoles= new PatchTheHoles();
        Assertions.assertEquals(3,patchTheHoles.solution(X,Y,W));
        //Given X = [4, 8, 2, 2, 1, 4], Y = [1, 2, 3, 1, 2, 3] and W = 3, the answer is 2
        X = new int[]{4, 8, 2, 2, 1, 4};
        Y = new int[]{1, 2, 3, 1, 2, 3};
        W=3;
        Assertions.assertEquals(2,patchTheHoles.solution(X,Y,W));

        X = new int[]{0, 3, 6, 5};
        Y = new int[]{0, 3, 2, 4};
        W=1;
        Assertions.assertEquals(3,patchTheHoles.solution(X,Y,W));
    }
}
