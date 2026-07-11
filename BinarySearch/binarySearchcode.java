package BinarySearch;

public class binarySearchcode {
    static int binarySearch(int arr[], int target){
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int mid = start + (end - start) / 2; //to avoid integer overflow

        while(start <= end){
            if(arr[mid] == target){
                return mid;
            }
            else if (target > arr[mid]) {
                //go to right side
                start = mid + 1;
            }
            else {
                //if (target < arr[mid])
                //go to left side
                end = mid - 1;
            }
            //update mid
            mid = start + (end - start) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 23, 30, 37, 42, 45, 55, 59, 60, 84};
        int target = 37;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
}
