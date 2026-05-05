// Pattern 10: Hollow Pyramid Pattern
package Pattern;

class Pattern10_HollowPyramid {
    public static void main(String[] args) {

        int n = 5;

        // Outer loop -> controls rows
        for (int row = 1; row <= n; row++) {

            // Inner loop 1 -> prints spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            // Boundary condition:
            // first row and last row -> full stars
            if (row == 1 || row == n) {

                for (int col = 1; col <= 2 * row - 1; col++) {
                    System.out.print("* ");
                }

            } else {

                // print first star
                System.out.print("* ");

                // print hollow spaces inside
                for (int col = 1; col <= 2 * row - 3; col++) {
                    System.out.print("  ");
                }

                // print last star
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }
    }
}