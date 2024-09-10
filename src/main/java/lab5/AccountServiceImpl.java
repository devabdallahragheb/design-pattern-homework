package lab5;

import java.util.Collection;

public class AccountServiceImpl implements AccountService {
    private AccountDAO accountDAO;
    Command command;

    public AccountServiceImpl() {
        accountDAO = new AccountDAOImpl();
        command=new NoCommand();
    }

    public Account createAccount(String accountNumber, String customerName) {
        Account account = new Account(accountNumber);
        Customer customer = new Customer(customerName);
        account.setCustomer(customer);

        accountDAO.saveAccount(account);

        return account;
    }

    public void deposit(String accountNumber, double amount) {
        Account account = accountDAO.loadAccount(accountNumber);
        command = new DepositCommand(account,amount);
        command.execute();
        accountDAO.updateAccount(account);
    }

    public Account getAccount(String accountNumber) {
        Account account = accountDAO.loadAccount(accountNumber);
        return account;
    }

    public Collection<Account> getAllAccounts() {
        return accountDAO.getAccounts();
    }

    public void withdraw(String accountNumber, double amount) {
        Account account = accountDAO.loadAccount(accountNumber);
        command = new WithdrawCommand(account,amount);
        command.execute();
        accountDAO.updateAccount(account);
    }


    public void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description) {
        Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
        Account toAccount = accountDAO.loadAccount(toAccountNumber);
        command = new TransferFundCommand(fromAccount, toAccount, amount,description);
        command.execute();
        accountDAO.updateAccount(fromAccount);
        accountDAO.updateAccount(toAccount);
    }

    @Override
    public void undo() {
        command.undo();
    }
}
