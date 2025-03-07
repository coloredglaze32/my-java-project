package lambda_learning;

import java.util.Random;

public class RandomNumHandlerDemo {
    public static void main(String[] args) {
        useRandomNumHandler(() -> {
            Random r = new Random();
            int num = r.nextInt(100);
            return num;
        });
    }

    public static void useRandomNumHandler(RandomNumHandler randomNumHandler){
        int num = randomNumHandler.getNum();
        System.out.println("生成随机数：" + num);
    }
}
