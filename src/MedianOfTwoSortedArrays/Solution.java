package MedianOfTwoSortedArrays;

import java.util.*;

public class Solution {
    public double findMedianSortedArrays(int A[], int B[]) {
        if (A.length == B.length) {
            int[] C = new int[A.length * 2];
            int j = A.length;
            for (int i = 0; i < A.length; i++, j++) {
                C[i] = A[i];
                C[j] = B[i];
            }
            Arrays.parallelSort(C);
            return (C[A.length - 1] + C[A.length]) / 2.0;
        }
        LinkedList<Integer> set = new LinkedList<>();
        int aIterator = 0;
        int bIterator = 0;
        while (aIterator < A.length || bIterator < B.length) {
            if (aIterator < A.length) {
                set.add(A[aIterator]);
                aIterator++;
            }
            if (bIterator < B.length) {
                set.add(B[bIterator]);
                bIterator++;
            }
        }
        int size = set.size();
        int[] array = new int[size];
        int i = 0;
        for (Integer integer : set) {
            array[i] = integer;
            i++;
        }
Arrays.parallelSort(array);
        return size % 2 == 0 ? (array[size / 2] + array[size / 2 - 1]) / 2.0 : array[size / 2];
    }
}
