package lab7;

import java.util.function.Consumer;

public class TotalSalaryConsumer implements Consumer<Hire> {
    private double totalSalary = 0;

    @Override
    public void accept(Hire hire) {
        totalSalary += hire.getSalary();
    }

    public double getTotalSalary() {
        return totalSalary;
    }
}
