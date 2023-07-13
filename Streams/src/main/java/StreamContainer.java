import java.util.Random;

public class StreamContainer {
    private String name;
    private long count;

    StreamContainer(String name) {
        this.name = name;
        count = new Random().nextInt(100);
    }

    public String getName() {
        return name;
    }

    public long getCount() {
        return count;
    }

    @Override
    public String toString() {
        return name + " " + count;
    }
}
