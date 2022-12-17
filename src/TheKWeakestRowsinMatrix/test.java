package TheKWeakestRowsinMatrix;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
Solution solution=new Solution();
int [][]arr={{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        System.out.println(Arrays.toString(solution.kWeakestRows(arr, 3)));
    }
}
