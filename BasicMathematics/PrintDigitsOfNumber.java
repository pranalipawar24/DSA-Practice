package BasicMathematics;

public class PrintDigitsOfNumber {
    static void sumNum(int num){
        while(num!=0){
            int digit = num % 10;
            System.out.println(digit);
            //last digit remove
            num = num /10;
        }
    }
    static void main(String[] args) {
        int num = 2345297;
        sumNum(num);
    }
}
