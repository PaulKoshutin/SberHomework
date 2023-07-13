public class ResourceProcessor {
    public synchronized void increase() throws InterruptedException {
        while (Resource.getField() >= 5)
            wait();
        Resource.setField(Resource.getField() + 1);
        System.out.println(Resource.getField());
        if (Resource.getField() >= 5)
            notify();
    }

    public synchronized void decrease() throws InterruptedException {
        while (Resource.getField() < 1)
            wait();
        Resource.setField(Resource.getField() - 1);
        System.out.println(Resource.getField());
        if (Resource.getField() < 1)
            notify();
    }
}
