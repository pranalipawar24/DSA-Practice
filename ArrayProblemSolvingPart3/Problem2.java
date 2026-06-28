//Given an array containing n distinct numbers from the range 0 to n, find the missing number.
// Example:
// Input:[3, 0, 1]
// Output: 2
package ArrayProblemSolvingPart3;

public class Problem2 {
    static int missingNumber(int nums[]) {
        int n = nums.length;
        int xor = 0;

        // XOR with numbers from 0 to n
        for(int i = 0; i <= n; i++) {
            xor = xor ^ i;
        }

        // XOR with array elements
        for(int i = 0; i < n; i++) {
            xor = xor ^ nums[i];
        }

        return xor;
    }

    public static void main(String[] args) {
        int nums[] = {2, 1, 0, 3, 4};
        System.out.println(missingNumber(nums));
    }
}