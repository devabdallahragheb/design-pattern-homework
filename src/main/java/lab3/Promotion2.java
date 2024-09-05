package lab3;

public class Promotion2  extends InterestPromotionDecorator {
    public Promotion2(InterestStrategy strategy) {
        super(strategy);
    }

    @Override
    public double getInterest(double balance) {
        double baseInterest = super.calculateInterest(balance);
        return baseInterest + (balance * 0.02);
    }
}