package TwoDArray;

public class Problem4 {
    static int[][] transpose(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;

        // Transpose matrix will have cols x rows size
        int ans[][] = new int[m][n];

        // Copy elements
        for(int row = 0; row < n ; row++){
            for(int col = 0; col < m; col++){
                ans[col][row] = arr[row][col];
            }
        }
        return ans;
    }

    static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int result[][] = transpose(arr);
        // Print transpose matrix
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                System.out.print(result[row][col] + " ");
            }
            System.out.println();
        }
    }
}

