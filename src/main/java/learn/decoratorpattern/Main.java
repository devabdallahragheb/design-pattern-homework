package learn.decoratorpattern;

public class Main {
    public static void main(String[] args) {
write(new Compressed(new CloudStream()));
    }

    public  static  void write(Stream data){
        data.write("testtttttttttttttttttt");
    }
}
