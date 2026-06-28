//Problem: Find the Unique Element in an Array
//Given an array where every element appears twice except one element, find the element that appears only once.
//Example:
//Input: [2, 3, 5, 4, 5, 3, 4]
//Output: 2
package ArrayProblemSolvingPart3;

public class Problem3 {
    static int findUnique(int arr[]) {
        int n = arr.length;
        int xor = 0;

        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }

    static void main(String[] args) {
        int arr[] = {2, 3, 5, 4, 5, 3, 4};
        System.out.println(findUnique(arr));
    }
}
//Complexity:
//Time: O(n)
//Space: O(1)