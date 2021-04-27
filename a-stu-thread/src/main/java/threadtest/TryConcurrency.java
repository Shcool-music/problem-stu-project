package threadtest;

import java.util.concurrent.TimeUnit;

public class TryConcurrency {
    /**
     * 说明：线程启动必须在一个任务之前，否则线程不会得到启动，那么自然线程里面的任务也不会得到启动
     * <p>
     * 创建一个线程，并且重写其run方法
     * 启动新的线程，只有调用了Thread的start();方法，线程才是被启动的，否则和普通的java对象没什么差别
     *
     * @param args
     */
    public static void main(String[] args) {
//        browseMusic();
        new Thread(TryConcurrency::browseMusic).start();
        browseNews();
    }

    private static void browseNews() {
        for (; ; ) {
            System.out.println("Uh-hhh, the good news");
            sleep(1);
        }
    }

    private static void browseMusic() {
        for (; ; ) {
            System.out.println("Uh-hhh, the good music");
            sleep(1);
        }
    }

    private static void sleep(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
