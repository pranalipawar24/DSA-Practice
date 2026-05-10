package ArrayBasics.TwoDArray;
public class Min2DArrays {
    static void main(String[] args) {
        int arr [][] = {{1,2,3}, {21,5,16}};
        int minVal = arr[0][0];

        for(int i = 0; i <= arr.length-1; i++){
            for( int j = 0; j <= arr[1].length-1; j++){
                if(arr[i][j] < minVal){
                    minVal = arr[i][j];
                }
            }
        }
        System.out.println("Minimum value from 2D Array Elements: " + minVal);
    }
}
