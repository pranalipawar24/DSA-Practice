package ArrayBasics.TwoDArray;

public class Max2DArrays {
    static void main(String[] args) {
        int arr [][] = {{1,2,3}, {21,5,16}};
        int maxVal = arr[0][0];

        for(int i = 0; i <= arr.length-1; i++){
            for( int j = 0; j <= arr[1].length-1; j++){
                if(arr[i][j] > maxVal){
                    maxVal = arr[i][j];
                }
            }
        }
        System.out.println("Maximum value from 2D Array Elements: " + maxVal);
    }
}
