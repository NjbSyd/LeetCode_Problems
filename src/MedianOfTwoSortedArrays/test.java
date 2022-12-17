package MedianOfTwoSortedArrays;

import java.util.TreeSet;

public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
        int[] B = {0, 6};
        System.out.println(solution.findMedianSortedArrays(A, B));
    }
}
