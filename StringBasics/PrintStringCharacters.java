package StringBasics;

public class PrintStringCharacters {
    static void stringChar(String str){
        for(int i = 0; i<=str.length()-1; i++){
            System.out.println(str.charAt(i));
        }
    }
    static void main(String[] args) {
        String str = "Pranali Pawar";
        stringChar(str);
    }
}
