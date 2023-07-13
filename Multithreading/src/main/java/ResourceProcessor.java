public class ResourceProcessor {
    public synchronized void increase() throws InterruptedException {
        while (Resource.getRes() >= 5)
            wait();
        Resource.setRes(Resource.getRes() + 1);
        System.out.println(Resource.getRes());
        notify();
    }

    public synchronized void decrease() throws InterruptedException {
        while (Resource.getRes() < 1)
            wait();
        Resource.setRes(Resource.getRes() - 1);
        System.out.println(Resource.getRes());
        notify();
    }
}
