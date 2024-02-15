public class MatchLowerUpperChar {
    public static int matchUpperletters(String input) {
        int count = 0;
        if (input.charAt(0) >= 65 && input.charAt(0) <= 90) {
            return count;
        }
        return count;
    }

    //     ASCII values for uppercase letters range from 65 to 90, while the ASCII
//        values for lowercase letters range from 97 to 122
    //"aaAbcCABBc"
    public static int matchLowerLetters(String input) {
        int[] sArr = new int[26];
        for (int i = 0; i < input.length(); i++) {
            Character ch = input.charAt(i);
            if (ch >= 97 && ch <= 122) {
                if (sArr[ch - 97] == -1) {
                    //already visited and reject it
                    sArr[ch - 97] = -2;
                } else if (sArr[ch - 97] == 0) {
                    sArr[ch - 97] = 1;
                }  //0-25
            } else if (sArr[ch - 65] == 1) {
                sArr[ch - 65] = -1;  //visited & satisfied
            } else if (sArr[ch - 65] == 0) {
                sArr[ch - 65] = -2; //reject it
            }
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (sArr[i] == -1) {
                count++;
            }
        }
        return count;


    }
}
