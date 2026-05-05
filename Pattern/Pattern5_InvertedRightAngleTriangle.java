// Pattern 5: Inverted Right-Angle Triangle Pattern
package Pattern;

class Pattern5_InvertedRightAngleTriangle {
    public static void main(String[] args) {

        int n = 5;

        // Outer loop -> controls rows
        for (int row = 1; row <= n; row++) {

            // Inner loop -> controls columns
            // For each row -> number of columns decreases
            for (int col = 1; col <= n - row + 1; col++) {

                // Print star
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }
    }
}