 To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tutor
 */
public class Length {

    public static void main(String[] args) {
        // Declare a 2D ARRAY
        int[][] numbers
                = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};

        // Display number of rows
        System.out.println("The number of rows is:" + numbers.length);

        // Display number of column in each row.
        for (int div = 0; div < numbers.length; div++) {
            System.out.println("The number of columns in "
                    + div + " is " + numbers[div].length);

        }
    }

}
