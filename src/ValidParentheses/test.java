package ValidParentheses;

public class test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 1; i < 10; i++) {
            if ((i % 3 == 0)) {
                System.out.println(arr[i % 3]);
                System.out.println(arr[i % 2]);
            }
        }
    }
}