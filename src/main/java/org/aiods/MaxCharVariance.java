package org.aiods;

public class MaxCharVariance {

    public static void main(String[] args) {
        System.out.println(largestVariance("aababbb"));
        System.out.println(largestVariance1("aababbb"));
    }
   static public int largestVariance(String s) {
        // Length of the input string.
        int length = s.length();
        // Variable to store the maximum variance found so far.
        int maxVariance = 0;

        // Iterate over all possible pairs of characters (a and b are different).
        for (char firstChar = 'a'; firstChar <= 'z'; ++firstChar) {
            for (char secondChar = 'a'; secondChar <= 'z'; ++secondChar) {
                if (firstChar == secondChar) {
                    // If both characters are the same, skip this iteration.
                    continue;
                }

                // Array to keep track of the frequency of character 'a'
                // f[0] is the streak of 'a's, f[1] is the max variance for the current window.
                // Initialize with 0 for streak and -n for variance because variance cannot be less than -n.
                int[] frequency = new int[] {0, -length};

                // Iterate over each character in the string.
                for (int i = 0; i < length; ++i) {
                    if (s.charAt(i) == firstChar) {
                        // If the current character is 'a', increase both frequencies.
                        frequency[0]++;
                        frequency[1]++;
                    } else if (s.charAt(i) == secondChar) {
                        // If the current character is 'b', calculate the variance.
                        frequency[1] = Math.max(frequency[0] - 1, frequency[1] - 1);
                        // Reset the streak of 'a's because 'b' is encountered.
                        frequency[0] = 0;
                    }
                    // Update the maximum variance found.
                    maxVariance = Math.max(maxVariance, frequency[1]);
                }
            }
        }

        // Return the largest variance found.
        return maxVariance;
    }

   static public int largestVariance1(String s) {
        int maxVariance=0;
        int length = s.length();

       for (char firstChar = 'a'; firstChar <= 'z'; ++firstChar) {
           for (char secondChar = 'a'; secondChar <= 'z'; ++secondChar) {

               if (firstChar==secondChar){
                   continue;
               }
               int[] freq=new int[]{0,-length};

               for (int i = 0; i <length; ++i) {
                   if (s.charAt(i) == firstChar){
                       freq[0]++;
                       freq[1]++;

                   } else if (s.charAt(i) == secondChar) {
                       freq[1] = Math.max(freq[0]-1,freq[1]-1);
                       freq[0] = 0 ;
                   }
                   maxVariance=Math.max(maxVariance,freq[1]);
               }

           }

       }

        return  maxVariance;
   }
}

