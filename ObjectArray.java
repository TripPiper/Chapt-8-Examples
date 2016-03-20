import java.util.Scanner;


/**
This programs works with an array of three BankAccount Objects
 The BankAccount Class is saved in Chapt-8-Examples under BankAccount.java
 */
public class ObjectArray {

    public static void main(String[] args) {

        final int NUM_ACCOUNT = 3;             // Number of accounts

        // Create an array that can reference bank account object
        BankAccount[] accounts = new BankAccount[NUM_ACCOUNT];

        // Create objects for the array.
        createAccounts(accounts);

        //Display the balance of each account.
        System.out.println(" Here are the balance of each account .");

        for (int index = 0; index < accounts.length; index++) {
            System.out.println(" Account " + (index + 1) + ": $ " + accounts[index].getBalance());
        }

    }

    /**
     * The createAccounts method creates a BankAccount object for each element
     * of an array. The user is asked for each account's balance.
     *
     * @param array The array to reference the account.
     */
    private static void createAccounts(BankAccount[] array) {
        double balance; // To hold Balance

        //Create a scanner object.
        Scanner keyboard = new Scanner(System.in);

        //Create the accounts.
        for (int index = 0; index < array.length; index++) {
            //Get the account balance.
            System.out.println(" Enter the balance for account " + (index + 1) + ":  ");
            balance = keyboard.nextDouble();

            // Create the account.
            array[index] = new BankAccount(balance);
        }
    }
}

