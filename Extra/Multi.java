package Extra;

public class Multi extends Thread {
    private int threadNumber;

    public Multi (int threadNumber) {
       this.threadNumber = threadNumber; 
       }
    
    @Override
    public void run() {
       for (int i=1 ; i<=5;i++) {
        System.out.println(i+"from thread"+threadNumber);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
       }
    }
}
