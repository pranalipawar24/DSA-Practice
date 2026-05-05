// Pattern 7: Inverted Solid Pyramid Pattern
package Pattern;

class Pattern7_InvertedSolidPyramid {
    public static void main(String[] args) {

        int n = 5;

        // Outer loop -> controls rows
        for (int row = 1; row <= n; row++) {

            // Inner loop 1 -> prints spaces
            for (int col = 1; col <= row - 1; col++) {
                System.out.print("  ");
            }

            // Inner loop 2 -> prints stars
            for (int col = 1; col <= 2 * n - 2 * row + 1; col++) {
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }
    }
}