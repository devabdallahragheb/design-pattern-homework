package lab7;


import java.util.function.Consumer;

public class Employee extends Hire {

    public Employee(String name, double salary) {
        super(name, salary);
    }
    public void add(Hire hire) {
        throw new UnsupportedOperationException("Cannot add to an employee.");
    }

    @Override
    public void remove(Hire hire) {
        throw new UnsupportedOperationException("Cannot remove from an employee.");

    }

    @Override
    public void print() {
        System.out.println("Employee: " + getName() + ", Salary: " + getSalary());
    }

    @Override
    public void accept(Consumer<Hire> action) {
        action.accept(this);
    }



}
