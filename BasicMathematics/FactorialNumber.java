package BasicMathematics;

public class FactorialNumber {
    static void fact(int num){
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }
        System.out.println("Factorial = " + fact);
    }
    static void main(String[] args) {
        fact(5);
    }
}
