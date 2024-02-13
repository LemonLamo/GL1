package Extra;

public class Multithreading {
  
    public static void main(String[] args) {
        for (int i=0 ;i<=3 ; i++) {
            Multi myThing = new Multi(i);
           // Thread t = new Thread(myThing);
            myThing.start();
        }
       //the start method will make sure the multithreading is happening
       //myThread.join();
       //
    }
}
