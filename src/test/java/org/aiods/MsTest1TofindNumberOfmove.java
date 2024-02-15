package org.aiods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MsTest1TofindNumberOfmove {


    @Test
    void numberOfMovesForChars(){


        MsTest1 msTest1= new MsTest1();
        Assertions.assertEquals(0,msTest1.findnoOfMovechars("QABAAAWOBL"));
        Assertions.assertEquals(1,msTest1.findnoOfMovechars("NAABXXAN"));
        Assertions.assertEquals(2,msTest1.findnoOfMovechars("NAANAAXNABABYNNBZ"));
    }
}
