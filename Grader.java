
import java.util.Scanner;

/**
 * Grader _________________________________ -testScores:double[]
 * _________________________________ +Grader (scoreArray : double[]);
 * +getLowestScore() :double +getAverage() : double
 * _________________________________
 */
/**
 * The Grader class calculates the average of an array of test scores , with the
 * lowest score dropped.
 */
public class Grader {

    // The testScores field is a variable
    // that will reference an array
    // of test scores.
    private double[] testScores;

    /**
     * Constructor
     *
     * @param scoreArray An array of test scores.
     */
    public Grader(double[] scoreArray) {
        //Assign the array arguments to
        // the testScore field.
        testScores = scoreArray;
    }

    /**
     * getLowestScore method
     *
     * @return The lowest test score.
     */
    public double getLowestScore() {
        double lowest; // To hold the lowest score
        //Get the first test score in the array.
        lowest = testScores[0];

        // Step through the rest of the array.When 
        // a value less then lowest is found, assign 
        // it to lowest.
        for (int index = 1; index < testScores.length; index++) {
            if (testScores[index] < lowest) {
                lowest = testScores[index];
            }
        }
        // Return the lowest test score.
        return lowest;
    }

    /**
     * getAverage method
     *
     * @ return The average of the test scores with the lowest score dropped.
     */
    public double getAverage() {
        double total = 0;   // To hold the score total
        double lowest;     // To hold the lowest score
        double average;    // To hold the average
        // If the array contains less than two test
        // scores, display an error message and set
        // average to 0.
        if (testScores.length < 2) {
            System.out.println("ERROR : You must have at " + " least two test score ! ");
            average = 0;
        } else {
// First, calculate the total of the scores.
            for (double score : testScores) {
                total += score;
            }

            //Next , get the lowest score.
            lowest = getLowestScore();
            //Subtract the lowest score from the total.
            total -= lowest;
            // Get the adjusted average.
            average = total / (testScores.length - 1);
        }

        // Return the adjusted average.
        return average;

    }

    public static void main(String[] args) {
        int numScores;      // To hold the number of scores

        // Create a SCanner object for the keyboard input.
        Scanner keys = new Scanner(System.in);

        //Get the number of test scores.
        System.out.print("How many testscores do you have ?");
        numScores = keys.nextInt();

        // Create an array to hold the test scores.
        double[] scores = new double[numScores];

        //Get the test scores and store them
        // in the score array.
        for (int index = 0; index < numScores; index++) {
            System.out.print("Enter scores # " + (index + 1) + ":");
            scores[index] = keys.nextDouble();}
        
            // create a grader object,
            //passing the score array as
            //an argument to the constructor
            Grader myGrader = new Grader(scores);

            // Display the adjusted average.
            System.out.println(" Your adjusted average is "
                    + myGrader.getAverage());

            //Display the lowest score.
            System.out.println(" Your lowest test score was  "
                    + myGrader.getLowestScore());

        }

    }
