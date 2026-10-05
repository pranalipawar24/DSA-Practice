package BinarySearch;

public class UnboundedSearch {
    // Unbounded Search(Exponential Search)
    static int unboundedSearch(int[] arr, int target) {

        // Check first element
        if (arr[0] == target) {
            return 0;
        }
        // Start with index 1
        int i = 1;

        // Keep doubling until we find a value >= target
        while (i < arr.length && arr[i] < target) {
            i = i * 2;
        }

        // If i goes beyond array length,
        // make it point to the last index.
        if (i >= arr.length) {
            i = arr.length - 1;
        }

        // Binary Search between previous power of 2 and current index
        int start = i / 2;
        int end = i;

        return binarySearch(arr, start, end, target);
    }

    // Normal Binary Search
    static int binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {
                2, 5, 8, 12, 16, 23, 38, 56,
                72, 90, 101, 150, 170, 200, 250, 300
        };
        int target = 72;
        int ans = unboundedSearch(arr, target);
        if (ans != -1) {
            System.out.println("Target found at index = " + ans);
        } else {
            System.out.println("Target not found");
        }
    }
}