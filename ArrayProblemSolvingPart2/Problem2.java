// right shift by 1 position
package ArrayProblemSolvingPart2;

public class Problem2 {

    static void shift(int arr[]){
        //Step 1: Store last element's value
        int n = arr.length;
        int temp = arr[n-1];

        //Step 2: shift all values of array
        for( int i = n-1; i > 0; i--){
            arr[i] = arr [i-1];
        }

        //Step 3: copy temp's value at index 0
        arr[0] = temp;
    }

    static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        shift(arr);
        for( int a: arr){
            System.out.print(a + " ");
        }
    }
}
