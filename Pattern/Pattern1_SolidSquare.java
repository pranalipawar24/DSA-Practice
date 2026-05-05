// Pattern 1: Solid Square Pattern
package Pattern;

class Pattern1_SolidSquare {
    public static void main(String[] args) {

        int n = 6; // size of square

        // Outer loop -> controls rows
        for (int row = 1; row <= n; row++) {

            // Inner loop -> controls columns
            // For each row, we print n stars
            for (int col = 1; col <= n; col++) {

                // Print star
                System.out.print("* ");
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}
