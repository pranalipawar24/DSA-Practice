// Pattern 8: Hollow Rectangle Pattern
package Pattern;

class Pattern8_HollowRectangle {
    public static void main(String[] args) {

        int n = 4;

        // Outer loop -> controls rows
        for (int row = 1; row <= n; row++) {

            // Inner loop -> controls columns
            for (int col = 1; col <= 6; col++) {

                // Boundary condition:
                // print star at first row, last row, first column, last column
                if (row == 1 || row == n || col == 1 || col == 6) {
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