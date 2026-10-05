//Search in an almost sorted array
//Given a sorted integer array arr[] consisting of distinct elements,
// where some elements of the array are moved to either of the adjacent positions, i.e. arr[i] may be present at arr[i-1] or arr[i+1].
//Examples:
//Input: arr[] = [10, 3, 40, 20, 50, 80, 70], target = 40
//Output: 2
//Explanation: Index of 40 in the given array is 2.

//Input: arr[] = [10, 3, 40, 20, 50, 80, 70], target = 90
//Output: -1
//Explanation: 90 is not present in the array.
package BinarySearch;

public class Problem8 {
    static int findTarget(int arr[], int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check mid, mid-1, and mid+1
            if (mid > 0 && arr[mid - 1] == target) {
                return mid - 1;
            }
            if (arr[mid] == target) {
                return mid;
            }
            if (mid < n - 1 && arr[mid + 1] == target) {
                return mid + 1;
            }
            // Since the array is nearly sorted,
            // skip the adjacent elements already checked.
            if (target > arr[mid]) {
                start = mid + 2;
            } else {
                end = mid - 2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 40, 20, 50, 80, 70};
        int target = 40;
        int ans = findTarget(arr, target);
        if (ans != -1) {
            System.out.println("Element found at index: " + ans);
        } else {
            System.out.println("Element not found");
        }
    }
}
