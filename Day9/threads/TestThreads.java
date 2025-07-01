package Day9.threads;

public class TestThreads {
    public static void main(String[] args) {
        ThreadA t1 = new ThreadA();
        ThreadA t2 = new ThreadA();
        ThreadB t3 = new ThreadB();

        t1.start();
        t2.start();//we call start who internally calls run()
        new  Thread(t3).start(); //passing  t3 run function to thread object


    }
}
