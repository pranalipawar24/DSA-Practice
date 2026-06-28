//find first repeating element
package ArrayProblemSolvingPart4;
import java.util.HashMap;

public class Problem4 {
    static int findRepeatingElement(int arr[]){
        HashMap<Integer, Integer> freq = new HashMap<>();
        //freq store
        for(int num : arr){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for(int i: arr){
            if(freq.get(i) > 1){
                return i;
            }
        }
        return -1;
    }

    static void main(String[] args) {
        int arr[] = {3, 3, 2, 2, 1, 2, 4};
        System.out.println(findRepeatingElement(arr));
    }
}
