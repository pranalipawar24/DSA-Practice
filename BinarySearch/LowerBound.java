package BinarySearch;

public class LowerBound {
    static int lowerBound(int arr[], int target){
        int n = arr.length;
        int start = 0;
        int end  = n - 1;
        int ans = n;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] >= target){
                //ans store
                ans = mid;
                //move left
                end = mid - 1;
            }
            else{
                //move right
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 30, 30, 40, 50, 60};
     // int target = 30; // answer: 2
        int target = 45; // answer: 6
        int ans = lowerBound(arr, target);
        System.out.println(ans);
    }
}

