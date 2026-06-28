//For threeSum
package ArrayProblemSolvingPart4;

import java.util.Arrays;

public class Problem2 {
    static int[] threeSum(int arr[], int target){
        int n = arr.length;
        for(int i = 0; i < n-2; i++){
            for(int j = i + 1; j < n-1; j++){
                for(int k = j + 1; k < n; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        int ans [] = {i ,j, k};
                        return ans;
                    }
                }
            }
        }
        int ans[] = {};
        return ans;
    }

    static void main(String[] args) {
        int arr[] = {2, 7, 11, 15, 4};
        System.out.println(Arrays.toString(threeSum(arr, 13)));
    }
}
