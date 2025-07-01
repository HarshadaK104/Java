package Day9.threads;

public class ThreadB implements Runnable{
    public void run(){
        long id=Thread.currentThread().getId();
        System.out.println("Starting thread, instance:"+ id);
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread-"+id+"iteration-"+i);
        }
        System.out.println("Ending thread, instance:"+ id);
    }
}
