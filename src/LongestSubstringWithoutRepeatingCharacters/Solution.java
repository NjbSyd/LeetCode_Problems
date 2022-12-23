package LongestSubstringWithoutRepeatingCharacters;

public class Solution {
   public int lengthOfLongestSubstring(String s) {
       int[] map = new int[256];
       int max = 0;
       for (int i = 0, j = 0; i < s.length(); i++) {
           j = Math.max(j, map[s.charAt(i)]);
           max = Math.max(max, i - j + 1);
           map[s.charAt(i)] = i + 1;
       }
       return max;
   }

}
