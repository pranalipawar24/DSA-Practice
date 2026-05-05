// Pattern 12: Hollow Diamond Pattern
package Pattern;

class Pattern12_HollowDiamond {
    public static void main(String[] args) {

        int n = 5;

        // Upper Part
        for (int row = 1; row <= n; row++) {

            // Print spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            // Boundary condition
            if (row == 1) {

                System.out.print("* ");

            } else {

                // First star
                System.out.print("* ");

                // Hollow spaces
                for (int col = 1; col <= 2 * row - 3; col++) {
                    System.out.print("  ");
                }

                // Last star
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower Part
        for (int row = n - 1; row >= 1; row--) {

            // Print spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            // Boundary condition
            if (row == 1) {

                System.out.print("* ");

            } else {

                // First star
                System.out.print("* ");

                // Hollow spaces
                for (int col = 1; col <= 2 * row - 3; col++) {
                    System.out.print("  ");
                }

                // Last star
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}