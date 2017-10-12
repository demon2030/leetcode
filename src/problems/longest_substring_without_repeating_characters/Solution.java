package problems.longest_substring_without_repeating_characters;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> lastChar = new HashMap<>();
        int start = -1;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            Integer pos = lastChar.get(s.charAt(i));
            if (pos != null) {
                if (start < pos) {
                    start = pos;
                }
            }
            lastChar.put(s.charAt(i), i);
            int len = i - start;
            if (len > maxLen) {
                maxLen = len;
            }
        }
        return maxLen;
    }
}
