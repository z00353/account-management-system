/**
 * This demo file contains three instances of class Account
 * The program prints out the data from three user accounts
 *
 * @author Elitsa Popova
 * @version 09/12/16
 */

public class Demo2 {
    public static void main(String[] args) {
        // Objects to be created for class Account
        Account user1, user2, user3;
        // Created objects using the five parameters from the class Account
        user1 = new Account(2000, 2000, 200, "Lilly", "Luton");
        user2 = new Account(1000, 1000, 100, "Ann", "London");
        user3 = new Account(6000, 8000, 200, "Amy", "Milton Keynes");
        // Displays the data with the method show.Data defined in class Account
        user1.showData();
        user2.showData();
        user3.showData();
        // Prints the accounts number as objects correspondent to static class variable numOfAccounts
        System.out.println("\nNumber of accounts: "+Account.numOfAccounts);
    }
}

