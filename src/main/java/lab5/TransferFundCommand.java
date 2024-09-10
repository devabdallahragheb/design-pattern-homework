package lab5;
public class TransferFundCommand implements Command {
    Account toAccount;
    Account fromAccount;
    double amount;
    String description;

    public TransferFundCommand(Account toAccount, Account fromAccount, double amount, String description) {
        this.toAccount = toAccount;
        this.fromAccount = fromAccount;
        this.amount = amount;
        this.description = description;
    }

    @Override
    public void execute() {
        fromAccount.transferFunds(toAccount, amount, description);
    }

    @Override
    public void undo() {
        toAccount.transferFunds(fromAccount, amount, description);
    }
}
