package lab2;

public class Logger implements Observer {
    @Override
    public  void  update(Account account){
        System.out.println("this message from Logger sender"+account.getAccountNumber()+"have change in balance"+account.getBalance());
    }
}
