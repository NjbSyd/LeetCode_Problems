package RichestCustomerWealth;

public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        int result = solution.maximumWealth(accounts);
        System.out.println(result);
    }
}
