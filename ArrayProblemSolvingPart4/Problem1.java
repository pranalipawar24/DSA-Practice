//Problem: Two Sum
//Given an array of integers nums and an integer target, find the indices of two numbers whose sum is equal to the target.
//Input:
//nums = [2,7,11,15]
//target = 9
//Output: [0,1]
package ArrayProblemSolvingPart4;

import java.util.Arrays;

public class Problem1 {
    static int[] twoSum(int arr[], int target){
        int n=arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    int ans[] = {i,j};
                    return ans;
                }
            }
        }
        int ans[] = {};
        return ans;
    }

    static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(arr, 18)));
    }
}
//Time Complexity: O(n²)
//Space Complexity: O(1)