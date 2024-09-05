package learn.decoratorpattern;

public class Compressed implements Stream{
    Stream stream;

    public Compressed(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        String compressedDate=compressed(data);
        stream.write(compressedDate);
    }

    private String compressed(String data){
        return data.substring(0,5);

    }
}
