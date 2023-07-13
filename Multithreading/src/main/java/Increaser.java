import java.lang.reflect.InvocationTargetException;

public class Increaser extends Thread {
    private ResourceProcessor resourceProcessor;

    Increaser(ResourceProcessor resourceProcessor) {
        this.resourceProcessor = resourceProcessor;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                resourceProcessor.increase();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
