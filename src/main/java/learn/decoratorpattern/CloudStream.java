package learn.decoratorpattern;

public class CloudStream implements Stream{

    @Override
    public void write(String data) {
        System.out.println("storing data"+data);
    }
}
