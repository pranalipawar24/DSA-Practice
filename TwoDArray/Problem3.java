//Problem: Wave Print a Matrix
//Given a 2D matrix, print its elements in a column-wise wave pattern.
//Input:
//        1 2 3
//        4 5 6
//        7 8 9
//
//Output: 1 4 7 8 5 2 3 6 9

package TwoDArray;

public class Problem3 {
    static void wavePrint(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        // Traverse each column
        for(int col = 0 ; col < m; col++){
            // Even column -> Top to Bottom
            if (col % 2 == 0){
                for(int row = 0; row < n; row++){
                    System.out.print(arr[row][col] + " ");
                }
            }
            // Odd column -> Bottom to Top
            else {
                for(int row = n - 1; row >= 0; row--){
                    System.out.print(arr[row][col] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        wavePrint(arr);
    }
}
