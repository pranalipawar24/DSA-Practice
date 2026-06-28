//Given an array containing only 0s and 1s, sort the array in such a way that all 0s come before all 1s.
package ArrayProblemSolvingPart3;

import java.util.Arrays;

public class Problem1 {

    static int[] sortArray(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;

      while(i<j){
          if(arr[i] == 1 && arr[j] == 0){
              //swap
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
          }
          if(arr[i] == 0){
              i++;
          }
          if(arr[j] == 1){
              j--;
          }
      }
      return arr;
    }

    static void main(String[] args) {
        int arr[] = {1, 0, 0, 1, 0, 1, 1};
        System.out.println(Arrays.toString(sortArray(arr)));
    }
}
