//2643. Row With Maximum Ones
package TwoDArray;

import java.util.Arrays;

public class Problem7 {
    static int[] rowAndMaximumOnes(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int maxCount = 0;
        int rowIndex = 0;

        // Traverse every row
        for (int row = 0; row < rows; row++) {
            int count = 0;
            // Count number of 1's in the current row
            for (int col = 0; col < cols; col++) {
                if (mat[row][col] == 1) {
                    count++;
                }
            }

            // Update maximum count and row index
            if (count > maxCount) {
                maxCount = count;
                rowIndex = row;
            }
        }
        return new int[]{rowIndex, maxCount};
    }

    public static void main(String[] args) {
        int[][] mat = {
                {0, 1, 1},
                {1, 1, 1},
                {1, 0, 0}
        };
        int[] ans = rowAndMaximumOnes(mat);
        System.out.println(Arrays.toString(ans));
    }
}
