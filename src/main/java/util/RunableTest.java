package util;

public class RunableTest implements Runnable {

    @Override
    public void run() {
        System.out.println("thread 1 has started !");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

