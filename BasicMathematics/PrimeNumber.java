package BasicMathematics;
import java.util.Scanner;

public class PrimeNumber {
    static void primeNo(int num){
        for (int i=2; i<=num-1; i++){
            if(num/i==0){
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Not a Prime Number");
            }
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int ans = sc.nextInt();
        primeNo(ans);
    }
}