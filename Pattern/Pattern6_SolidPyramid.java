// Pattern 6: Solid Pyramid Pattern
package Pattern;

class Pattern6_SolidPyramid {
    public static void main(String[] args) {

        int n = 5;

        // Outer loop -> controls rows
        for (int row = 1; row <= n; row++) {

            // Inner loop 1 -> prints spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            // Inner loop 2 -> prints stars
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }
    }
}