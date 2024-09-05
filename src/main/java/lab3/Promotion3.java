package lab3;

public class Promotion3 extends InterestPromotionDecorator {
    public Promotion3(InterestStrategy strategy) {
        super(strategy);
    }

    @Override
    public double getInterest(double balance) {
        double baseInterest = super.calculateInterest(balance);
        return baseInterest + (balance * 0.03);  // Add 3% promotional interest
    }
}