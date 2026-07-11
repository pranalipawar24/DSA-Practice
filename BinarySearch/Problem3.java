package BinarySearch;

public class Problem3 {
    // Function to find the peak index
    static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = -1;

        while(start <= end){
            // Find middle index
            int mid = start + (end - start) / 2;
            // We are on the increasing slope
            if(arr[mid] < arr[mid+1]){
                // Peak lies on the right side
                start = mid + 1;
            }
            else{
                // We are on the decreasing slope
                //(arr[mid] >= arr[mid+1])
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 4, 2, 1};
        int ans = peakIndexInMountainArray(arr);
        System.out.println("Peak Index = " + ans);
        System.out.println("Peak Element = " + arr[ans]);
    }
}


