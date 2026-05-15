package BasicMathematics;

public class PrimeNumber {
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
        int num = 3;
        System.out.println(primeNo(num));
    }
}