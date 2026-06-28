//Mode of array elements
package ArrayProblemSolvingPart2;
import java.util.HashMap;

public class Problem4 {
        static int getMode(int arr[]) {

            // Step 1: Create HashMap to store frequency
            HashMap<Integer, Integer> freq = new HashMap<>();

            // Step 2: Count frequency of each element
            for(int num : arr) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }

            // Step 3: Find element with maximum frequency
            int maxFreq = -1;
            int maxFrequencyKey = -1;

            for(int key : freq.keySet()) {
                int currentFrequency = freq.get(key);
                if(currentFrequency > maxFreq) {
                    maxFreq = currentFrequency;
                    maxFrequencyKey = key;
                }
            }
            return maxFrequencyKey;
        }

        public static void main(String[] args) {
            int arr[] = {2, 3, 5, 3, 7, 3, 2};
            System.out.println("Mode = " + getMode(arr));
        }
    }

