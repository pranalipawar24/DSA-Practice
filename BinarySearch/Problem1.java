// Count the total number of occurrences of a number in a sorted array
package BinarySearch;

public class Problem1 {
    int lowerBound(int arr[], int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    int upperBound(int arr[], int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    int countFreq(int arr[], int target) {
        int lbIndex = lowerBound(arr, target);
        int ubIndex = upperBound(arr, target);
        return ubIndex - lbIndex;
    }

    static void main(String[] args) {
        Problem1 obj = new Problem1();   // Create object
        int arr[] = {1, 1, 2, 2, 2, 2, 3};
        int target = 2;
        int ans = obj.countFreq(arr, target);
        System.out.println("Frequency = " + ans);
    }
}