import java.util.*;

public class Test {

    public static void main(String[] args) {
        System.out.println(Test01.getArea(3));
    }
}

class Test01{
    public static final double PI = 3.14;

    public static double getArea(double r){
        return Test01.PI * r * r;
    }
}
