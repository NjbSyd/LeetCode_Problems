package TheKWeakestRowsinMatrix;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        oneIndex[] arr = new oneIndex[mat.length];
        for (int i = 0; i < mat.length; i++) {
            int numOfSoldiers = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    if (j == 0) {
                        arr[i] = new oneIndex(i);
                    }
                    break;
                }
                if (mat[i][j] == 1) {
                    if (arr[i] == null) {
                        arr[i] = new oneIndex(i);
                    }
                    arr[i].count++;
                }
            }
        }
        Arrays.parallelSort(arr, new oneIndexComparator());
        return getArr(arr, k);
    }

    private int[] getArr(oneIndex[] arr, int k) {
        int[] ints = new int[k];
        for (int i = 0; i < k; i++) {
            ints[i] = arr[i].index;
        }
        return ints;
    }

    class oneIndex {
        int index;
        int count;

        oneIndex(int i) {
            index = i;
            count = 0;
        }
    }

    class oneIndexComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            oneIndex i1 = (oneIndex) o1;
            oneIndex i2 = (oneIndex) o2;
            if (i1.count == i2.count)
                return 0;
            else if (i1.count > i2.count)
                return 1;
            else
                return -1;
        }
    }
}
