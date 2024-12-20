/**
 *
 * @author Your name
 */
package coe318.lab4;

public class Bank {
    private String name;
    /**
     * An array of Accounts managed by
     * this bank.
     */
    private Account [] accounts; 
    private int numAccounts;//number of active accounts

    public Bank(String name, int maxNumberAccounts) {
        this.name = name;
        accounts = new Account[maxNumberAccounts];
        numAccounts = 0;
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;  //Fix this
    }

    /**
     * @return the numAccounts
     */
    public int getNumAccounts() {       //3 getters
        return numAccounts; //Fix this
    }


    public Account[] getAccounts() {
        return accounts; //Fix this
    }

    /**
     * Return true if the Bank already has an account
     * with this number; otherwise false.
     * @param accountNumber
     * @return
     */
    public boolean hasAccountNumber(int accountNumber) {
        int counting = 0;
        while (counting < accounts.length){
            if (accounts[counting] == null) // Loops to find an account number with
                return false;               // with value. If no value, return false
            if (accounts[counting].getNumber() == accountNumber)
                return true;        //Checks and finds an account number of equal number
            counting = counting + 1;
        }
        return false; //No account number has been found
    }

    /**
     * Adds the specified account to the Bank if possible. If the account number
     * already exists or the Bank has reached its maximum
     * number of accounts, return false and do not add it; otherwise,
     * add it and return true.
     * @param account
     * @return true if successful
     */
    public boolean add(Account account) {
        int counting = 0;
        if(this.hasAccountNumber(account.getNumber())){ // Sees if that account number
            return false;                               // Already exists.
        }
        while (counting < accounts.length){ //If no account number exists
            if (accounts[counting] == null){//it creates that account number
                accounts[counting] = account;
                numAccounts = numAccounts + 1;
                return true;                // Added account - no issues
            }                               // and all is successful
            counting = counting + 1;
        }
        return false; //Return false to signify no account has been added
    }

    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        String s = getName() + ": " + getNumAccounts() +
                " of " + getAccounts().length +
                " accounts open";
        for(Account account : getAccounts()) {
            if (account == null) break;
            s += "\n  " + account;
        }
        return s;
    }
}
