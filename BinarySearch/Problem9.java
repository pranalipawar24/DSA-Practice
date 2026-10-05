//leetcode 74

package BinarySearch;

public class Problem9 {
    static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int totalRow = n-1;
        int totalColumn = matrix[0].length;
        int s = 0;
        int e = n-1;
        while(s<=e){
            int mid = s + (e - s) / 2;
            int rowIndex = mid / totalColumn;
            int columnIndex = mid % totalColumn;

            if(matrix[rowIndex][columnIndex] == target){
                return true;
            }
            else if (matrix[rowIndex][columnIndex] < target){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 3;
        boolean ans = searchMatrix(matrix, target);
        System.out.println(ans);
    }
}