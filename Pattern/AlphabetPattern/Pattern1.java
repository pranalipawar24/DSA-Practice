package Pattern.AlphabetPattern;

public class Pattern1 {
        public static void main(String[] args) {

            int n = 5;

            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= row; col++) {
                    char ch = (char) ('A' + col - 1);
                    System.out.print(ch + " ");
                }
                System.out.println();
            }
        }
    }

