package PalindromeLinkedList;

public class test {
    public static void main(String[] args) {
        ListNode head=new ListNode(1,new ListNode(0,new ListNode(0,new ListNode(1))));
        Solution solution=new Solution();
        System.out.println(solution.isPalindrome(head));
    }
}
