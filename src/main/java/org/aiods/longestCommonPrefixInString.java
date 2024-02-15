package org.aiods;

import java.util.Arrays;

public class longestCommonPrefixInString {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"geeksforgeeks", "geeks", "geek",
                "geeze"},4));
    }
  static   String longestCommonPrefix(String[] strings, int n){
        if (strings==null || strings.length==0) return  "-1";
        String prefix=strings[0];

            for (int i=1;i< n;i++){
                int j=0;
                String newString=strings[i];
                while (j<prefix.length() && j<newString.length() &&  prefix.charAt(j)==newString.charAt(j)){

                    j++;
                }
                prefix=prefix.substring(0,j);
            }

      if (prefix==null || prefix.isEmpty()) return  "-1";
      else
       return prefix;

    }
}
