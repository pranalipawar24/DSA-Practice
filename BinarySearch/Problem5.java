//Leet code 33
package BinarySearch;

public class Problem5 {
    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[start] <= nums[mid]) {
                // Target lies in left half
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                }
                // Search right half
                else {
                    start = mid + 1;
                }
            }

            // Right half is sorted
            else {
                // Target lies in right half
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                }
                // Search left half
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {6, 7, 0, 1, 2, 4, 5};
        int target = 4;
        int ans = search(nums, target);
        System.out.println(ans);
        }
    }
