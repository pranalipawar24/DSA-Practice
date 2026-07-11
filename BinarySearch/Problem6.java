// LeetCode 81 - Search in Rotated Sorted Array II
package BinarySearch;

public class Problem6 {

    static boolean search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Target found
            if (nums[mid] == target) {
                return true;
            }

            // Cannot decide which half is sorted because of duplicates
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            }
            // Left half is sorted
            else if (nums[start] <= nums[mid]) {

                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // Right half is sorted
            else {

                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {6, 7, 0, 1, 2, 4, 5};
        int target = 4;

        boolean ans = search(nums, target);
        System.out.println(ans);
    }
}