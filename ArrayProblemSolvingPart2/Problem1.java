//reversing of array elements
package ArrayProblemSolvingPart2;

public class Problem1 {

    static void reverse(int arr[]){
        int n = arr.length;

        int i = 0;
        int j = n - 1;

        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]  = temp;
            i++;
            j--;
        }
        for (int k : arr){
            System.out.print(k + " ");
        }
    }

    static void main(String[] args) {
        int arr[] = {4, 5, 7, 10, 15, 18};
        reverse(arr);
    }
}
