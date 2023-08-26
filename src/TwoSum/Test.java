package TwoSum;

public class Test {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] answer = Solution.twoSum(nums, target);
        System.out.println("[" + answer[0] + ", " + answer[1] + "]");
    }
}
