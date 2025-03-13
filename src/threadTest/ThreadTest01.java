package threadTest;

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程" + i);
        }
    }
}

public class ThreadTest01 {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        t.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程" + i);
        }
    }
}
