//Search for an element in an array{linear search}
package ArrayProblemSolvingPart1;

public class Problem3 {
     static boolean findTarget(int arr[], int target){
         for(int i =0; i < arr.length; i++){
             if(arr[i]==target){
                 return true;
             }
         }
         return false;
     }

    static void main(String[] args) {
        int arr[] = {1, 3 ,5, 7, 8, 9};
        System.out.println(findTarget(arr, 6));
    }
}
