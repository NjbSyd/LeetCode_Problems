package RichestCustomerWealth;

public class Solution {
    public int maximumWealth(int[][] accounts) {
    int max=0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
