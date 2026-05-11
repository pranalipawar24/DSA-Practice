package BasicMathematics;

public class SumOfNumbers {
    static int Sum(int num){
        int sum = 0;
        while(num!=0){
            int digit = num % 10;
            sum = sum + digit;
            //last digit remove
            num = num /10;
        }
        return sum;
    }
    static void main(String[] args) {
        int ans = Sum(2345297);
        System.out.println(ans);
    }
}
