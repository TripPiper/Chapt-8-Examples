/*
  This program saves contents from an array to a file.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class arraysAndFiles {

    public static void main(String[] args) throws FileNotFoundException {

        int[] numbers = {10, 20, 30, 40, 50};

        //Open the file.
        PrintWriter outputFile = new PrintWriter("Values.txt");

        // Write the array elements to the file.
        for (int index = 0; index < numbers.length; index++) {
            outputFile.println(numbers[index]);
            System.out.println(numbers[index] );
        }

        //Close the file.
        outputFile.close();
        
              
    }

    }
