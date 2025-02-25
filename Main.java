import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static <T> void func(T e){
        System.out.println(e);
    }
    public static void main(String[] args) {
        //创建TreeSet集合的时候，需要使用这个比较器
        //TreeSet<turtle> turtleTreeSet = new TreeSet<>();//这样不行，没有通过构造方法传递一个比较器进去

        //给构造方法传递一个比较器
        //TreeSet<turtle> turtleTreeSet = new TreeSet<>(new TurtleComparator());

        //使用匿名内部类的方式(这个类没有名字，直接new接口)
        TreeSet<turtle> turtleTreeSet = new TreeSet<>(new Comparator<turtle>() {
            @Override
            public int compare(turtle turtle, turtle t1) {
                return turtle.age-t1.age;
            }
        });

        turtleTreeSet.add(new turtle(230));
        turtleTreeSet.add(new turtle(500));
        turtleTreeSet.add(new turtle(450));
        turtleTreeSet.add(new turtle(1000));

        for(turtle t : turtleTreeSet){
            System.out.println(t);
        }
    }
}

//定义乌龟类
class turtle{
    int age;
    public turtle(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "turtle{" +
                "age=" + age +
                '}';
    }
}
