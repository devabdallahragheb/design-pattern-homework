package lab9;

public class ComplexClass  implements IComplex {

    public ComplexClass() throws InterruptedException {
        // Simulate a time-consuming object creation (e.g., 10 seconds)
        Thread.sleep(10000);
    }

    @Override
    public void veryComplicatedTask() {
        System.out.println("Very complicated task...");
    }
}