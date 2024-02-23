package LeetCode.PalindromeNumber;

public class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int num = x;
        int numReversed = 0;
        while (x != 0) {
            numReversed = numReversed * 10 + x % 10;
            x /= 10;
        }
        return num == numReversed;
    }
}
