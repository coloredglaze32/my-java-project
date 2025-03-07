package lambda_learning;

public class StringHandlerDemo {
    public static void main(String[] args) {
        useStringHandler((String msg) -> {
            System.out.println("hello " + msg);
        });
    }

    public static void useStringHandler(StringHandler stringHandler) {
        stringHandler.printMessage("wh");
    }
}
