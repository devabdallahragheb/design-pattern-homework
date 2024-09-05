package lab2;

public class SMSSender implements Observer {
    @Override
    public void update(Account account) {
        System.out.println("this message from SMS sender"+account.getAccountNumber()+"have change in balance"+account.getBalance());
    }
}
