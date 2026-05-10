package ArrayBasics.TwoDArray;

public class SumOfTwo_DArrays {
    static void main(String[] args) {
        int arr [][] = {{1,2,3}, {4,5,6}};
        int sum = 0;
        int mul = 1;

        for(int i = 0; i <= arr.length-1; i++){
            for( int j = 0; j <= arr[1].length-1; j++){
                sum = sum + arr[i][j];
            }
        }
        System.out.println("Sum of 2D Array Elements: " + sum);
    }
}
