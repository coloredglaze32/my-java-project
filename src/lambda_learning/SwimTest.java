package lambda_learning;

public class SwimTest {
    public static void method(Swim s){
        s.swim();
    }
    public static void main(String[] args) {
        // 使用匿名内部类的方法
        Swim s = new Swim(){
            @Override
            public void swim() {
                System.out.println("swim!");
            }
        };
        method(s);

        // 使用lambda表达式的方法
        method( () -> {
            System.out.println("lambda : swim!");
        } );
    }
}
