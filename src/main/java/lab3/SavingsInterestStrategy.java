package lab3;

public class SavingsInterestStrategy implements InterestStrategy {
    @Override
    public double getInterest(double balance) {
        if ( balance < 1000) {
            return 0.01;
        } else if (balance > 1000 && balance < 5000) {
            return 0.02;
        }  else  {
            return 0.04;
        }
    }
}
