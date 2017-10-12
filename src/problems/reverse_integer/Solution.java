package problems.reverse_integer;

/**
 * https://leetcode.com/problems/reverse-integer
 */
public class Solution {
    public int reverse(int x) {
        int r = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            int tmp = r * 10 + lastDigit;
            if ((tmp - lastDigit) / 10 != r) return 0;
            r = tmp;
            x = x / 10;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverse(-10));
    }

}
