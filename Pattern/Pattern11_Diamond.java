// Pattern 11: Diamond Pattern
package Pattern;

class Pattern11_Diamond {
    public static void main(String[] args) {

        int n = 5;

        // Upper part of diamond
        for (int row = 1; row <= n; row++) {

            // Print spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            // Print stars
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower part of diamond
        for (int row = 1; row <= n; row++) {

            if (row == 1) {
                continue;
            }

            // Print spaces
            for (int col = 1; col <= row - 1; col++) {
                System.out.print("  ");
            }

            // Print stars
            for (int col = 1; col <= 2 * n - 2 * row + 1; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}