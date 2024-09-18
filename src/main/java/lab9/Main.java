package lab9;

public class Main {
    public static void main(String[] args) {
        IComplex proxy = VirtualProxy.createProxy();
        System.out.println("proxy start.");
        proxy.veryComplicatedTask();
    }
}