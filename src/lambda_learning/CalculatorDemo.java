package lambda_learning;

public class CalculatorDemo {
    public static void main(String[] args) {
        useCalculator((int a, int b) -> a - b);
    }
    public static void useCalculator(Calculator calculator){
        int calc = calculator.calc(10,20);
        System.out.println("计算结果是：" + calc);
    }
}
