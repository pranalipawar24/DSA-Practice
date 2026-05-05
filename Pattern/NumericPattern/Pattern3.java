package Pattern.NumericPattern;

public class Pattern3 {
    static void main(String[] args) {
        int n = 4;

        for(int row = 1; row <= n; row++) {

            // spaces
            for(int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            // increasing
            for(int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            // decreasing
            int decRowValue = row - 1;
            for(int col = 1; col <= row - 1; col++) {
                System.out.print(decRowValue + " ");
                decRowValue--;
            }

            System.out.println();
        }
    }
}
