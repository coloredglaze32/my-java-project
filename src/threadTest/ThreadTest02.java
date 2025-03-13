package threadTest;

class MyThread1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程" + i);
        }
    }
}

public class ThreadTest02 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread1());

        t.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程" + i);
        }
    }
}
