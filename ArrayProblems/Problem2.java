//Kadane's Algorithm
package ArrayProblems;

public class Problem2 {
    static int maxSumArray(int arr[]){
        int n = arr.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            // add current element
            sum = sum + arr[i];
            // update maximum sum
            maxSum = Math.max(sum, maxSum);

            // if sum becomes negative, restart
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
    static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSumArray(arr));
    }
}

//time complexity: O(n)
//space complexity: O(1)

