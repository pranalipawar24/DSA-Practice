//leetcode 1047. Remove All Adjacent Duplicates In String

package StringBasics;

public class Problem5 {
    static String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder();
        // Traverse every character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // Remove adjacent duplicate
            if (ans.length() > 0 && ans.charAt(ans.length() - 1) == ch) {
                ans.deleteCharAt(ans.length() - 1);
            } else {
                ans.append(ch);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "abbaca";
        String result = removeDuplicates(s);
        System.out.println(result);
    }
}
