public class SummingOfAllElement {

    public static void main(String[] args) {
        // Declare a 2D ARRAY
        int[][] numbers
                = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};

        int total;

        for (int col = 0; col < numbers[0].length; col++) {
            // Set the Accumulator to  0.
            total = 0;

            // Sum a column.
            for (int row = 0; row < numbers.length; row++) {
                total += numbers[row][col];

                // Display the column's total.
                System.out.println(" Total of column " + col
                        + " is " + total);

            }

        }
    }
}
