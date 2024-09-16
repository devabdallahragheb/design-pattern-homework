package lab7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Manager extends Hire {
    private List<Hire> subordinates;

    public Manager(String name, double salary) {
        super(name, salary);
        this.subordinates = new ArrayList<>();
    }

    @Override
    public void add(Hire hire) {
        subordinates.add(hire);
    }

    @Override
    public void remove(Hire hire) {
        throw new UnsupportedOperationException("Cannot remove from an employee.");
    }

    @Override
    public void print() {
        System.out.println("Manager: " + getName() + ", Salary: " + getSalary());
        for (Hire hire : subordinates) {
            hire.print();
        }
    }

    @Override
    public void accept(Consumer< Hire> action) {
        action.accept(this); // Call the consumer with this manager
        for (Hire hire : subordinates) {
            hire.accept(action); // Apply the action recursively to subordinates
        }
    }
}
