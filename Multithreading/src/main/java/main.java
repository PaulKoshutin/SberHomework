public class main {
    public static void main(String[] args) {
        //for (int i=0;i<3;i++)
        //new Increaser().start();

        ResourceProcessor resourceProcessor = new ResourceProcessor();
        Increaser inc = new Increaser(resourceProcessor);
        Decreaser dec = new Decreaser(resourceProcessor);
        Thread decThread = new Thread(dec);

        inc.start();
        decThread.start();
    }
}
