package lab3;

public class Promotion1 extends InterestPromotionDecorator {
    public Promotion1(InterestStrategy strategy) {
        super(strategy);
    }

    @Override
    public double getInterest(double balance) {
        double baseInterest = super.calculateInterest(balance);
        return baseInterest + (balance * 0.01);  // Add 1% promotional interest
    }


}
