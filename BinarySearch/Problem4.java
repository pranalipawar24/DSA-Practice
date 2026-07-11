/*
The Pivot Index in a rotated sorted array is the index of the smallest element. It is the point where the array was rotated.

Example 1
Original Array:
[1, 2, 3, 4, 5, 6, 7]

Rotated Array:
[4, 5, 6, 7, 1, 2, 3]
          ↑
     Pivot Index = 3
*/

package BinarySearch;

public class Problem4 {
    // Function to find pivot index (largest element)
    static int findPivot(int[] arr) {
        int n = arr.length;
        // If array is already sorted, no pivot
        if (arr[0] <= arr[n - 1]) {
            return -1;
        }
        int start = 0;
        int end = n - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // Pivot is in the right half
            if (arr[mid] <= arr[end]) {
                end = mid - 1;
            }
            // Pivot is at mid or in the left half
            else {
                ans = mid;
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int pivot = findPivot(arr);
        System.out.println("Pivot Index = " + pivot);
        System.out.println("Pivot Element = " + arr[pivot]);
    }
}
