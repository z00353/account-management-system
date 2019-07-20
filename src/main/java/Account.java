/**
 * This program displays user account data
 * The program consists of one main class Account and two orchestrating demo classes
 * This program is an example of correspondence between classes, methods and objects with their variables
 *
 * @author Elitsa Popova
 * @version 30/11/16
 */

// Importing java packages
import java.text.NumberFormat;// Default location monetary format
import java.util.Locale;// Location currency specifier

// Definition of class Account
public class Account {

    // ATTRIBUTES:
    /**
     * 3 account statements in different currency, account holder name, account holder address, account number counter
     */
    // Class instance variables always private, belonging to the class only.
    private int openingBalance;     // Data type int for whole number
    private int currentBalance;     // Data type int for whole number
    private int creditLimit;        // Data type int for whole number
    private String accHolderName;   // Data type String
    private String accHolderAddress;// Data type String
    // Static variable to store the total number of accounts
    public static int numOfAccounts = 0; // 'public'(visible for all members), 'static'(belongs to the class only)
    //Can be invoked through the class name or by object reference

    // METHODS:
    /**
     * Constructor // Special kind of method [Walter Savitch, Absolute java, 5th edition]
     */// Runs only once. Initializes the class instance variables so that methods and objects can use them
    public Account(int theOpening, int theCurrent, int theLimit, String theName, String theAddress) {
        openingBalance   = theOpening;// Class instance variable initialized to new value theOpening
        currentBalance   = theCurrent;// Class instance variable initialized to new value theCurrent
        creditLimit      = theLimit;  // Class instance variable initialized to new value theLimit
        accHolderName    = theName;   // Class instance variable initialized to new value theName
        accHolderAddress = theAddress;// Class instance variable initialized to new value theAddress
        // Increment operator ++
        // Number of accounts incremented by 1 each time an account is added
        numOfAccounts++;
    }

    // Setters and Getters which use the constructor parameters
    /**
     * Set opening balance
     */// Set method with parameter 'amount' of the type int. Sets new value 'amount' to the object
    public void setTheOpening(int amount) {// 'public' seen by all members, 'void' does not return anything
        openingBalance = amount;// Attribute has new value
    }
    /**
     * Get opening balance
     */// Get method with empty parameter since it only returns new value
    public int getTheOpening() {// Gets the value of the object
        return openingBalance;// 'return' statement is compulsory
    }


    /**
     * Set current balance
     */// Set method with parameter 'amount' of the type int. Sets new value 'amount' to the object
    public void setTheCurrent(int amount) {// 'public' seen by all members, 'void' does not return anything
        currentBalance = amount;// Attribute has new value
    }
    /**
     * Get current balance
     */// Get method with empty parameter since it only returns new value
    public int getTheCurrent() {// Gets the value of the object
        return currentBalance;// 'return' statement is compulsory
    }


    /**
     * Set credit limit
     */// Set method with parameter 'amount' of the type int. Sets new value 'amount' to the object
    public void setTheLimit(int amount) {// 'public' seen by all members, 'void' does not return anything
        creditLimit = amount;// Attribute has new value
    }
    /**
     * Get credit limit
     */// Get method with empty parameter since it only returns new value
    public int getTheLimit() {// Gets the value of the object
        return creditLimit;// 'return' statement is compulsory
    }


    /**
     * Set account holder's name
     */// Set method with parameter 'customerName' of the type String. Sets new value 'customerName' to the object
    public void setName(String customerName) {// 'public' seen by all members, 'void' does not return anything
        accHolderName = customerName;// Attribute has new value
    }
    /**
     * Get account holder's name
     */// Get method with empty parameter since it only returns new value
    public String getName() {// Gets the value of the object
        return accHolderName;// 'return' statement compulsory
    }


    /**
     * Set account holder's address
     */// Set method with parameter 'customerAddress' of the type String. Sets new value 'customerAddress' to the object
    public void setAddress(String customerAddress) {// 'public' seen by all members, 'void' does not return anything
        accHolderAddress = customerAddress;// Attribute has new value
    }
    /**
     * Get account holder's address
     */// Get method with empty parameter since it only returns new value
    public String getAddress() {// Gets the value of the object
        return accHolderAddress;// 'return' statement compulsory
    }


    // Method which displays the data
    /**
     * Show data for accounts
     */
    public void showData() { // Show all data for created object
        // Interacting with the class NumberFormat
        NumberFormat uk = NumberFormat.getCurrencyInstance(Locale.UK);// Method invocation NumberFormat.getCurrencyInstance(Locale.UK) with variable 'uk'
        // Using method 'format' to print floating number as string representing local currency
        System.out.println("\nOpening balance: "+uk.format(openingBalance)+"\nCurrent balance: "+uk.format(currentBalance));
        System.out.println("Credit limit:    "+uk.format(creditLimit)+"\nName: "+accHolderName+"\nAddress: "+accHolderAddress);
    }
}

