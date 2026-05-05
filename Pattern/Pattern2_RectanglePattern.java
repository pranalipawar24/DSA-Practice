package Pattern;

public class Pattern2_RectanglePattern {
    public static void main(String[] args) {

        int n = 3;

        // Outer loop -> controls rows
        for (int row = 1; row <= n; row++) {

            // Inner loop -> controls columns
            // For each row -> fixed 5 columns
            for (int col = 1; col <= 5; col
                    ++) {

                // Print star
                System.out.print(" * ");
            }

            // Move to next row
            System.out.println();
        }

        System.out.println();
    }
}
