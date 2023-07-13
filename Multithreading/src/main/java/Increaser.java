import java.lang.reflect.InvocationTargetException;

public class Increaser extends Thread {
    private ResourceProcessor resourceProcessor;

    Increaser(ResourceProcessor resourceProcessor) {
        this.resourceProcessor = resourceProcessor;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                ResourceProcessor.class.getMethod("increase").invoke(resourceProcessor);
            } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
