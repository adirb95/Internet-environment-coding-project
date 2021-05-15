package util;

public class RunnableTest2 implements Runnable {
    @Override
    public void run() {
        System.out.println("thread 1 has started !");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}