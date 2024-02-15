import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatchLowerUpperCharTest {

@Test

 void matchUpperCases(){

    int values = MatchLowerUpperChar.matchLowerLetters("aaAbcCABBc");
    assertEquals(2,values);

    values = MatchLowerUpperChar.matchLowerLetters("xyzXYZabcABC");
    assertEquals(6,values);

     values = MatchLowerUpperChar.matchLowerLetters("ABCabcAefG");
    assertEquals(0,values);

}
}

