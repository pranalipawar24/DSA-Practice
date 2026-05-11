//counting the length of string with length() function
package StringBasics;

public class CountLength {
    public static void main(String[] args) {
        String str = "Hello Java";
        int count = 0;

        // convert string to char array
        for (char ch : str.toCharArray()) {
            count++;
        }
        System.out.println("Length of string = " + count);
    }
}
