package StringBasics;

public class Problem2 {
    static char getMaxOccuringChar(String s) {
        int[] freq = new int[26];
        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        int maxFreq = 0;
        char ans = 'a';

        // Find the character with maximum frequency
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                ans = (char) (i + 'a');
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "testsample";
        char result = getMaxOccuringChar(s);
        System.out.println("Maximum occurring character: " + result);
    }
}