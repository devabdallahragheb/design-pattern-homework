package lab4;

import java.util.ArrayList;
import java.util.Collection;

public class DBAccountDAOImpl implements AccountDAO {
    Collection<Account> accountlist = new ArrayList<Account>();

    public void saveAccount(Account account) {
        // add the new
        System.out.println("save Account");
    }

    public void updateAccount(Account account) {
        System.out.println("update Account");

    }

    public Account loadAccount(String accountNumber) {
        for (Account account : accountlist) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        System.out.println("loaded account");
        return null;
    }

    public Collection<Account> getAccounts() {
        return accountlist;
    }

}
