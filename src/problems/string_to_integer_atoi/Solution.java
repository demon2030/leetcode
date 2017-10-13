package problems.string_to_integer_atoi;

/**
 * https://leetcode.com/problems/string-to-integer-atoi/description/
 */
public class Solution {
    public int myAtoi(String str) {
        if (str == null) return 0;
        int sign = 1;
        long n = 0;
        str = str.trim();
        if (str.isEmpty()) return 0;
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (c == '-')
                if (i == 0) { sign = -1; continue;}
                else
                    return 0;
            if (c == '+')
                if (i == 0) { sign = 1; continue;}
                else
                    return 0;

            if (Character.isDigit(c)) {
                n = n * 10 + Character.digit(c,10);
            } else break;
            if(n*sign>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(n*sign<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        return (int)n*sign;
    }
}

