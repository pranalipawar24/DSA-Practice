package BasicMathematics;

public class CountDigits {
    static int countNum(int num){
        int count = 0;
        while(num!=0){
            int digit = num % 10;
            count++;
            //last digit remove
            num = num /10;
        }
        return count;
    }
    static void main(String[] args) {
        int ans = countNum(2345297);
        System.out.println(ans);

    }
}
