package BasicMathematics;

public class ArmstrongNumber {
    static boolean isArmstrong(int num){
        int sum = 0;
        int originalNumber = num;

        while(num!=0) {
            int digit = num % 10;
            int cubeOfDigit = digit * digit * digit;
            sum = sum + cubeOfDigit;
            num = num / 10;
        }
        if (sum == originalNumber){
            return true;
        }
        return false;
    }
    static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}
