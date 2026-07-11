//Book Allocation Problem

package BinarySearch;

public class Problem7 {

    static boolean isValidAns(int arr[], int k, int maxPages) {
        int pages = 0;
        int studentCount = 1;

        for (int i = 0; i < arr.length; i++) {
            if (pages + arr[i] <= maxPages) {
                pages = pages + arr[i];
            } else {
                studentCount++;

                if (studentCount > k || arr[i] > maxPages) {
                    return false;
                }
                pages = arr[i];
            }
        }
        return true;
    }

    static int findPages(int[] arr, int k) {

        if (arr.length < k) {
            return -1;
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int start = 1;
        int end = sum;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isValidAns(arr, k, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {12, 34, 67, 90};
        int k = 2;
        int ans = findPages(arr, k);
        System.out.println("Minimum number of pages = " + ans);
    }
}
