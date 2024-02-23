package LeetCode.PalindromeNumber;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(Solution.isPalindrome(num));
    }
}
