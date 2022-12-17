package TwoSum;

public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {3,2,95,4,-3};
        int target = 92;
        int[] result = solution.twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);

    }
}
