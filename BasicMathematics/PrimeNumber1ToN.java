package BasicMathematics;

public class PrimeNumber1ToN {
    static boolean primeNo(int num){
        for (int i=2; i*i<=num; i++){
            if(num % i == 0){
                //not a prime
                return false;
            }
        }
        return true;
    }
    static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (primeNo(i)) {
                System.out.println(i);
            }
        }
    }
}
