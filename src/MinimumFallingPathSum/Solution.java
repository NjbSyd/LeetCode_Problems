package MinimumFallingPathSum;

public class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int[][] bottomUpResultingArray = new int[matrix.length][matrix.length];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            bottomUpResultingArray[0][i] = matrix[0][i];
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j == 0) {
                    bottomUpResultingArray[i][j] = matrix[i][j] + Math.min(bottomUpResultingArray[i - 1][j], bottomUpResultingArray[i - 1][j + 1]);
                } else if (j == matrix.length - 1) {
                    bottomUpResultingArray[i][j] = matrix[i][j] + Math.min(bottomUpResultingArray[i - 1][j], bottomUpResultingArray[i - 1][j - 1]);
                } else {
                    bottomUpResultingArray[i][j] = matrix[i][j] + Math.min(Math.min(bottomUpResultingArray[i - 1][j - 1], bottomUpResultingArray[i - 1][j]), bottomUpResultingArray[i - 1][j + 1]);
                }

            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (bottomUpResultingArray[matrix.length - 1][i] < min) min = bottomUpResultingArray[matrix.length - 1][i];
        }
        return min;
    }
}
