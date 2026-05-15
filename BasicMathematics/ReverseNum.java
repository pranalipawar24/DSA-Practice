package BasicMathematics;

public class ReverseNum {
    static int ReverseNum(int num){
        int RevNum = 0;
        while(num!=0){
            int digit = num % 10;
            RevNum = RevNum * 10 + digit;
            //last digit remove
            num = num /10;
        }
        return RevNum;
    }
    static void main(String[] args) {
        int ans = ReverseNum(2345297);
        System.out.println(ans);
    }
}
