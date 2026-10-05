//LeetCode 1910. Remove All Occurrences of a Substring
package StringBasics;

public class Problem3 {
    static String removeOccurrences(String s, String part) {
        // Keep removing the leftmost occurrence of 'part'
        while (s.contains(part)) {
            // Find the starting index of the LEFTMOST occurrence of 'part'
            int index = s.indexOf(part);

            // Remove 'part' by joining:
            // 1. Left part  -> characters before 'part'
            // 2. Right part -> characters after 'part'
            s = s.substring(0, index) + s.substring(index + part.length());
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";
        String result = removeOccurrences(s, part);
        System.out.println(result);
    }
}
