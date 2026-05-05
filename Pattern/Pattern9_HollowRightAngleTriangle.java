// Pattern 9: Hollow Right-Angled Triangle Pattern
package Pattern;

class Pattern9_HollowRightAngleTriangle {
    public static void main(String[] args) {

        int n = 5;

        // Outer loop -> controls rows
        for (int row = 1; row <= n; row++) {

            // Inner loop -> controls columns
            for (int col = 1; col <= row; col++) {

                // Boundary condition:
                // print star at first column, last column of row, and last row
                if (col == 1 || col == row || row == n) {
                    System.out.print("* ");
                } else {
                    // print space inside
                    System.out.print("  ");
                }
            }

            // Move to next line
            System.out.println();
        }
    }
}