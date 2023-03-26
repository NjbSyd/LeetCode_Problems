package PalindromeNumber;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int rev = 0;
        int temp = x;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == x;
    }
}

//class Solution {
//    public boolean isPalindrome(int x) {
//        char[] arr = String.valueOf(x).toCharArray();
//        if (arr.length == 1) return true;
//        int limit = 0;
//        int len = arr.length;
//        System.out.println(Arrays.toString(arr));
//        while (limit <= len / 2) {
//            System.out.println(arr[limit] + " " + arr[len - (limit + 1)]);
//            if (arr[limit] != arr[len - (limit + 1)]) {
//                return false;
//            }
//            limit++;
//        }
//        return true;
//    }
//}
