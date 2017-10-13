package problems.longest_palindromic_substring;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/
 */
public class Solution {
    public String longestPalindrome(String s) {
        if (s == null) return null;
        if (s.isEmpty()) return "";
        int len = s.length();

        while (len > 1) {
            for (int i = 0; i <= s.length() - len; i++) {
                if (isPalindrom(s, i, len)) {
                    return s.substring(i, i+len);
                }
            }
            len--;
        }
        return s.substring(0,1);
    }

    private boolean isPalindrom(String str, int start, int len) {
        if (len == 1) return true;
        int s = start;
        int e = start + len - 1;
        while (s<e) {
            if (str.charAt(s) != str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("babad"));
    }
}
