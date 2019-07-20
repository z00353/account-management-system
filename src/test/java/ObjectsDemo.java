/**
 * This demo class creates an object by keyboard input, prompting the user to enter name and address
 * The program displays the user's account details
 *
 * @author Elitsa Popova
 * @version 09/12/16
 */

// Import Scanner class from java util
import java.util.Scanner;
public class ObjectsDemo {
    public static void main(String [] args) {
        // Object to be created for class Account
        Account user;
        // Create instance of class Scanner, 'keyboard' to be used for user input
        Scanner keyboard = new Scanner(System.in);// Constructor for class Scanner
        System.out.println("Please enter your name:");// Prints a line
        String myName = keyboard.nextLine();// Takes user input as a variable for name
        System.out.println("Now enter your address:");// Prints a line
        String myAddress = keyboard.nextLine();// Takes user input as a variable for address

        // Create object 'user', instance of class Account
        user = new Account(300, 250, 7000, myName, myAddress);// Constructor for new object
        user.showData();// Show data for user using method showData of class Account
        // Prints the accounts number as object correspondent to static class variable numOfAccounts
        System.out.println("Account number: "+Account.numOfAccounts);
    }
}
