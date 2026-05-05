// Pattern 3: Right Angle Triangle Pattern
package Pattern;

class Pattern3_RightAngleTriangle {
    public static void main(String[] args) {

        int n = 5;

        // Outer loop -> controls rows
        for (int row = 1; row <= n; row++) {

            // Inner loop -> controls columns
            // For each row -> number of columns = row number
            for (int col = 1; col <= row; col++) {

                // Print star
                System.out.print(" * ");
            }

            // Move to next line
            System.out.println();
        }

        System.out.println();
    }
}