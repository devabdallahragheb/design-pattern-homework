package learn.decoratorpattern;

public class Encript implements Stream {
    public Encript(Stream stream) {
        this.stream = stream;
    }

    Stream stream;

    @Override
    public void write(String data) {
        String enriptedDate = encrypt(data);
        stream.write(enriptedDate);
    }

    private String encrypt(String data) {
        return "42r0uj092j4rmewfm329(#*$*";

    }
}
