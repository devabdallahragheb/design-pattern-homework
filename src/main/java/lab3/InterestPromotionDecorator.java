package lab3;

abstract class InterestPromotionDecorator implements InterestStrategy {
    protected InterestStrategy decoratedStrategy;

    public InterestPromotionDecorator(InterestStrategy strategy) {
        this.decoratedStrategy = strategy;
    }

    public double calculateInterest(double balance) {
        return decoratedStrategy.getInterest(balance);
    }
}
