package ArrayProblems;
import java.util.ArrayList;

public class Problem1 {
    static ArrayList<Integer> findMissing(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();

        int n = arr.length;

        // Mark visited numbers
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] > 0) {
                arr[index] = -arr[index];
            }
        }

        // Find unmarked indexes
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans.add(i + 1);
            }
        }
        return ans;
    }

    static void main(String[] args) {
        int arr[] = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findMissing(arr));
    }
}