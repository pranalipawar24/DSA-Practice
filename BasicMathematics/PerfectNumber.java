package BasicMathematics;

public class PerfectNumber {
    static boolean isPerfect(int num) {

        int sum = 0;

        // find proper divisors
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        int num = 6;

        if (isPerfect(num)) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }
}
