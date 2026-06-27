//Multiply each Array Element of array by 10
package ArrayProblemSolvingPart1;
import java.util.Arrays;

public class Problem2 {

static int[] multiplyby10(int arr[]){
    int size = arr.length;
    int newArray[] = new int[size];

     for (int i =0; i < size; i++){
         int currentElement = arr[i];
         int newElement = currentElement * 10;
         newArray[i] = newElement;
     }
     return newArray;
}

    static void main(String[] args) {
        int[] arr = {2, 4, 1, 3};
        System.out.println(Arrays.toString(multiplyby10(arr)));
    }
}

//Time and Space Complexity: O(n)