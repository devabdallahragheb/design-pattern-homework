package lab7;
import java.util.function.Consumer;

public abstract class Hire {
    protected String name;
    protected double salary;

    public Hire(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public abstract void add(Hire hire);

    public abstract void remove(Hire hire);

    public abstract void print();
    public abstract void accept(Consumer<Hire> action); // New method
}
