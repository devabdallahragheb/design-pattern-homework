package lab3;

public class CheckingsInterestStrategy implements InterestStrategy {
    @Override
    public double getInterest(double balance) {
        if ( balance < 1000) {
            return .015;
        }  else  {
            return .025;
        }
    }
}
