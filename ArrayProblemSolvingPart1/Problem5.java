//return sum of 0's and 1's in an array
package ArrayProblemSolvingPart1;

public class Problem5 {
    static int[] getPosNegSum(int arr[]){
        int zero = 0;
        int one= 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                zero ++;
            }
            else{
                one ++;
            }
        }
        int ans[] = {zero, one};
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 0, 0, 1, 1, 1};
        int ans[] = getPosNegSum(arr);
        System.out.println("Number of zeros = " +ans[0]);
        System.out.println("Number of ones = " +ans[1]);
    }
}
