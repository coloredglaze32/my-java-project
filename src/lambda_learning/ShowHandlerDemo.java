package lambda_learning;

public class ShowHandlerDemo {
    public static void useShowHandler(ShowHandler showHandler){
        showHandler.show();
    }

    public static void main(String[] args) {
        useShowHandler(() -> {
            System.out.println("调用show方法");
        });
    }
}
