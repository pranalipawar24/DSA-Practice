package StringBasics;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Pranali";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);

        //Another Approach
//        for(int i=str.length()-1; i>=0; i--){
//            char ch = str.charAt(i);
//            System.out.print(ch);
//        }
//    }
//
//    static void main(String[] args) {
//        String str = "Pranali";
//        reverseStr(str);
    }
}
