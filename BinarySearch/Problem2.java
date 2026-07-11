//to find the square root of a number.
package BinarySearch;

// Using Binary Search
class Problem2 {

    static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        int start = 0;
        int end = x;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == x / mid) {
                return mid;
            }
            else if (mid > x / mid) {
                end = mid - 1;
            }
            else {
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 8;
        int result = mySqrt(x);
        System.out.println("Square root of " + x + " = " + result);
    }
}

//Using Brute-force
//class Problem2 {
//    public int mySqrt(int x) {
//        int ans = 0;
//        for (int i = 1; i <= x; i++) {
//            if (i <= x / i) {
//                ans = i;
//            } else {
//                break;
//            }
//        }
//        return ans;
//    }
//}
