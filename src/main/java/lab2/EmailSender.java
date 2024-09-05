package lab2;

public class EmailSender implements Observer {
    @Override
    public void update(Account account) {
        System.out.println("this logger from email sender the account number have"+account.getAccountNumber()+"have change in balance"+account.getBalance());
    }
}
