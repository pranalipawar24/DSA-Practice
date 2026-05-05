// Pattern 4: Solid Rhombus Pattern
package Pattern;

class Pattern4_SolidRhombus {
    public static void main(String[] args) {

        int n = 5;

        // Outer loop -> controls rows
        for (int row = 1; row <= n; row++) {

            // Inner loop 1 -> prints spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            // Inner loop 2 -> prints stars
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }
    }
}