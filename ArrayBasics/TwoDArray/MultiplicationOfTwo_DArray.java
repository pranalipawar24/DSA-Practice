package ArrayBasics.TwoDArray;

public class MultiplicationOfTwo_DArray {
    static void main(String[] args) {
        int arr [][] = {{1,2,3}, {4,5,6}};
        int mul = 1;

        for(int i = 0; i <= arr.length-1; i++){
            for( int j = 0; j <= arr[1].length-1; j++){
                mul = mul * arr[i][j];
            }
        }
        System.out.println("Multiplication of 2D Array Elements: " + mul);
    }
}


