package ArrayProblemSolvingPart2;
import java.util.HashMap;

public class Problem5 {
    static int[] getHighestLowestFreqElement(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        // Step 1: Create frequency map
        for(int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find highest frequency element

        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;

        for(int key : freq.keySet()) {
            int currentFreq = freq.get(key);
            if(currentFreq > highestFreq) {
                highestFreq = currentFreq;
                highestNum = key;
            }
        }

        // Step 3: Find lowest frequency element
        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;

        for(int key : freq.keySet()) {
            int currentFreq = freq.get(key);
            if(currentFreq < lowestFreq) {
                lowestFreq = currentFreq;
                lowestNum = key;
            }
        }

        return new int[]{highestNum, lowestNum};
    }

    public static void main(String[] args) {
        int arr[] = {2,3,3,5,5,5,7};
        int ans[] = getHighestLowestFreqElement(arr);
        System.out.println("Highest Frequency Element = " + ans[0]);
        System.out.println("Lowest Frequency Element = " + ans[1]);
    }
}