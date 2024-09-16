package lab7;

public class Main {
    public static void main(String[] args) {
        Manager ceo = new Manager("Alice", 200000);
        Manager headOfEngineering = new Manager("Bob", 150000);
        Employee engineer1 = new Employee("Charlie", 100000);
        Employee engineer2 = new Employee("David", 100000);

        headOfEngineering.add(engineer1);
        headOfEngineering.add(engineer2);
        ceo.add(headOfEngineering);

        HireCounterConsumer hireCounter = new HireCounterConsumer();
        ceo.accept(hireCounter);
        System.out.println("Total hires: " + hireCounter.getCount());


        TotalSalaryConsumer totalSalaryConsumer = new TotalSalaryConsumer();
        ceo.accept(totalSalaryConsumer);
        System.out.println("Total salary: " + totalSalaryConsumer.getTotalSalary());
    }
}
