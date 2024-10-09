package introduction.fpij;

import java.util.Date;
import java.util.UUID;

public class tempString {

    public static class MyRunnable implements Runnable {

        private final ThreadLocal<String> threadLocal = new ThreadLocal<>();

        @Override
        public void run() {

            System.out.printf("%s [%s] :%s\n", new Date(), Thread.currentThread().getName(), "start");
            threadLocal.set(UUID.randomUUID().toString());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.printf("%s [%s] :%s\n", new Date(), Thread.currentThread().getName(), threadLocal.get());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.printf("%s [%s] :%s\n", new Date(), Thread.currentThread().getName(), "stop");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyRunnable task = new MyRunnable();

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(task);
            thread.start();
        }
    }
}