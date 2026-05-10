package ArrayBasics.TwoDArray;

import java.util.Scanner;

public class TwoD_Arrays {
    public static void main(String[] args) {

        // initialization
        int[][] arr = new int[3][4];
        //taking input
        Scanner s = new Scanner(System.in);
        for(int i = 0; i <= arr.length-1; i++){
            for(int j = 0; j <= arr[i].length-1; j++){
                System.out.println("Value for row: "+ i + " and for column: " + j);
                arr[i][j] = s.nextInt();
            }
        }
        // printing array elements
       for( int rowIndex = 0; rowIndex <= arr.length-1; rowIndex++){
           for(int columnIndex = 0; columnIndex <= arr[rowIndex].length -1 ; columnIndex++){
               System.out.print(arr[rowIndex][columnIndex] + " ");
           }
            System.out.println();
        }
    }
}
