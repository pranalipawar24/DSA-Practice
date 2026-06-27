//Find first unsorted element in an array
package ArrayProblemSolvingPart1;

public class Problem6 {
    static int getUnsortedElement(int arr[]){
        for(int i=0; i < arr.length; i++){
            if(arr[i+1] <= arr[i]){
                return arr[i+1];
            }
        }
        return -1;
    }

    static void main(String[] args) {
        int arr[] = {2, 6 ,9, 4, 10, 17};
        System.out.println(getUnsortedElement(arr));
    }
   }
