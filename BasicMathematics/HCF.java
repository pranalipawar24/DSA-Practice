package BasicMathematics;

public class HCF {
        static int getGCD(int a, int b) {
            // Euclid's idea:
            // gcd(a, b) = gcd(b, a % b)

            while (b != 0) {
                // store current value of b
                int temp = b;
                // update b with remainder
                b = a % b;
                // move previous b into a
                a = temp;
            }
            // when b becomes 0, a contains the GCD
            return a;
        }

        public static void main(String[] args) {
            int a = 35;
            int b = 192;
            System.out.println("GCD = " + getGCD(a, b));
        }
}

