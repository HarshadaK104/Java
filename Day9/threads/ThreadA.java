package Day9.threads;

public class ThreadA extends Thread {
    public void run(){
        System.out.println("Starting thread, instance:"+ getId());
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread-"+getId()+"iteration-"+i);
        }
        System.out.println("Ending thread, instance:"+ getId());
    }
}
