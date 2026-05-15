package BasicMathematics;

public class Palindrome {
    static int palindrome(int num){
        int RevNum = 0;
        while(num!=0){
            int digit = num % 10;
            RevNum = RevNum * 10 + digit;
            num = num /10;
        }
        return RevNum;
    }
    static void main(String[] args) {
        int original = 13455431;
        int reverse = palindrome(original);

        if(original == reverse){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}
