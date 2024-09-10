package lab5;
public class DepositCommand implements Command{
    Account account;
    double amount;

    public DepositCommand(Account account,double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.deposit(amount);
    }

    @Override
    public void undo() {
        account.withdraw(amount);
    }
}
