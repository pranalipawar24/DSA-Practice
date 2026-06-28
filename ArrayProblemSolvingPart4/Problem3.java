//Remove duplicate elements from an array
package ArrayProblemSolvingPart4;

public class Problem3 {
    static int removeDuplicates(int arr[]){
        int i = 0;
        int j = 1;
        int n = arr.length;
        while(j < n){
            //if i and j match
            if(arr[i] == arr[j]){
                j++;
            }
            else {
                i++;
                arr[i] = arr[j];
                j++;
            }
        }
        return i + 1;
    }

    static void main(String[] args) {
        int arr[] = {2, 4, 4, 5, 6, 6, 6, 8};
        int size = removeDuplicates(arr);

        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
