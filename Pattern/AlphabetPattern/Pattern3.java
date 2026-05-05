package Pattern.AlphabetPattern;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n; row++) {
            for(int col=1; col<=n-row; col++){
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                char ch = (char) ('A' + col - 1);
                System.out.print(ch + " ");
            }
            for(int col=1; col<=row-1; col++){
                char ch = (char) ('A' + col - 1);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}