//Leetcode 151:  Reverse Words in a String

package StringBasics;

public class Problem1 {
    static String reverseWords(String s) {

        StringBuilder ans = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            // Skip extra spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            if (i < 0) {
                break;
            }
            int j = i;
            // Find the beginning of the current word
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }
            // Append the current word
            ans.append(s.substring(j + 1, i + 1));
            // Add space between words
            if (j > 0) {
                ans.append(" ");
            }
            // Move to the previous word
            i = j - 1;
        }
        return ans.toString().trim();
    }

    public static void main(String[] args) {
        String s = "  the sky   is blue  ";
        String result = reverseWords(s);
        System.out.println(result);
    }
}
