//Print the sum of each row in an 2D array
package TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {

    public static List<Integer> rowSums(int[][] arr) {

        int n = arr.length; // Number of rows
        int m = arr[0].length; // Number of columns

        List<Integer> ans = new ArrayList<>();

        // Traverse each row
        for (int row = 0; row < n; row++) {
            int sum = 0; // Reset for every row
            // Traverse each column
            for (int col = 0; col < m; col++) {
                sum = sum + arr[row][col];
            }
            // Store current row sum
            ans.add(sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(rowSums(arr));
    }
}