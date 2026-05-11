package StringBasics;

public class StringMethods {

    static void main(String[] args) {

        String str = "  Hello Java  ";
        String str2 = "hello java";

        // 1. length()
        // Returns total number of characters including spaces
        System.out.println("1. length(): " + str.length());

        // 2. charAt(index)
        // Returns character at given index
        // Index starts from 0
        System.out.println("2. charAt(2): " + str.charAt(2));

        // 3. substring(beginIndex, endIndex)
        // Returns part of string
        // beginIndex included, endIndex excluded
        System.out.println("3. substring(2, 7): " + str.substring(2, 7));

        // 4. contains(CharSequence s)
        // Checks whether string contains given text
        // Returns true or false
        System.out.println("4. contains(\"Hello\"): " + str.contains("Hello"));

        // 5. equals(Object o)
        // Checks exact equality (case-sensitive)
        System.out.println("5. equals(): " + str.trim().equals(str2));

        // 6. equalsIgnoreCase(String s)
        // Checks equality ignoring upper/lower case
        System.out.println("6. equalsIgnoreCase(): " + str.trim().equalsIgnoreCase(str2));

        // 7. toUpperCase()
        // Converts entire string to uppercase
        System.out.println("7. toUpperCase(): " + str.toUpperCase());

        // 8. toLowerCase()
        // Converts entire string to lowercase
        System.out.println("8. toLowerCase(): " + str.toLowerCase());

        // 9. trim()
        // Removes spaces from beginning and end only
        String name = "   Pranali    ";
        System.out.println("9. trim(): length of string: " + name.length());
        System.out.println(name.trim());

        // 10. split(String regex)
        // Splits string into parts
        // Here splitting by space -> String Array
        String sentence = "Java is fun to learn";
        String[] words = sentence.split(" ");
        System.out.println("10. split():");
        for (String word : words) {
            System.out.println(word);
        }

        // 11. startsWith(String prefix)
        // Checks if string starts with given text
        String name1 = "Java Programming";
        System.out.println("11. startsWith: " + name1.startsWith("Java"));

        // 12. endsWith(String suffix)
        // Checks if string ends with given text
        String name2 = "Java Programming";
        System.out.println("12. endsWith: " + name2.endsWith("Programming"));

        // 13. valueOf(any type)
        // Converts different data types into string
        int number = 100;
        String numString = String.valueOf(number);
        System.out.println(number+1); //adds : 101
        System.out.println(numString + 1); //concatenates: 1011
        System.out.println("13. valueOf(): " + numString);

        // 14. toCharArray()
        // Converts string into character array
        char[] chars = "Code".toCharArray();
        System.out.println("14. toCharArray():");
        for (char ch : chars) {
            System.out.println(ch);
        }

        // 15. isEmpty()
        // True only if string length is 0
        String emptyStr = "";
        System.out.println("15. isEmpty(): " + emptyStr.isEmpty());

        // 16. isBlank()
        // True if string is empty or only spaces
        String blankStr = "   ";
        System.out.println("16. isBlank(): " + blankStr.isBlank());

        // 17. replace(oldChar, newChar)
        // Replaces characters
        System.out.println("17. replace('a', 'x'): " + sentence.replace('a', 'x'));

    }
}