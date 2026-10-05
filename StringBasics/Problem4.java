//leetcode 567. Permutation in String
package StringBasics;

public class Problem4 {
    public static boolean checkInclusion(String s1, String s2) {
        // If s1 is longer, permutation is impossible
        if (s1.length() > s2.length()) {
            return false;
        }

        // Frequency array for s1
        int[] freq1 = new int[26];
        // Frequency array for current window in s2
        int[] freq2 = new int[26];

        // Count frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
        }

        // Count frequency of first window of s2
        for (int i = 0; i < s1.length(); i++) {
            freq2[s2.charAt(i) - 'a']++;
        }

        // Check first window
        if (matches(freq1, freq2)) {
            return true;
        }

        // Slide the window
        for (int i = s1.length(); i < s2.length(); i++) {
            // Add new character entering the window
            freq2[s2.charAt(i) - 'a']++;

            // Remove old character leaving the window
            freq2[s2.charAt(i - s1.length()) - 'a']--;

            // Compare frequency arrays
            if (matches(freq1, freq2)) {
                return true;
            }
        }
        return false;
    }

    // Compare both frequency arrays
    public static boolean matches(int[] freq1, int[] freq2) {
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean ans = checkInclusion(s1, s2);
        System.out.println(ans);
    }
}
