//Average of elements in an array
package ArrayProblemSolvingPart1;

public class Problem1 {
    static double getAverage(int arr[]){
        double sum = 0;
        for(int i: arr){
            sum = sum + i;
        }
        int size = arr.length;
        double avg = sum / size;
        return avg;
    }

    static void main(String[] args) {
        int[] arr = {2,4,1,3};
        System.out.println(getAverage(arr));
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)
