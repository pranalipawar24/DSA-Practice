//counts no. of vowels in a string
package StringBasics;

public class VolwelsInString {
    public static void main(String[] args) {
        String str = "Hello Java";

        int count = 0;

        // convert to lowercase so both A and a are handled
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels = " + count);
    }
}
