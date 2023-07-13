import java.lang.reflect.InvocationTargetException;

public class Decreaser implements Runnable {
    private ResourceProcessor resourceProcessor;

    Decreaser(ResourceProcessor resourceProcessor) {
        this.resourceProcessor = resourceProcessor;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                ResourceProcessor.class.getMethod("decrease").invoke(resourceProcessor);
            } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
