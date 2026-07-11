package TwoDArray;

public class Problem6 {

    static void spiralPrint(int[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;

        int top = 0; //starting row
        int bottom = rows - 1; //ending row
        int left = 0; //starting column
        int right = cols - 1; //ending column






        while (top <= bottom && left <= right) {

            // Step 1: Left to Right
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " "); //Because we're printing the top row.
            }
            top++;

            // Step 2: Top to Bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // Step 3: Right to Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }

            // Step 4: Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {

        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        spiralPrint(arr);
    }
}