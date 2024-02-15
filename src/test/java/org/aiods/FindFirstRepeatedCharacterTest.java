package org.aiods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindFirstRepeatedCharacterTest {

    @Test
    void matchRepeatedChar(){
        Assertions.assertEquals("s",
                FindFirstRepeatedCharacter.firstRepChar("sdbsngedtryupwtfetrw"));
    }

}