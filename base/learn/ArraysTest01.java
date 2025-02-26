package base.learn;

import java.util.Arrays;
import java.util.Comparator;

/*
测试Arrays工具类的两种排序
 */

public class ArraysTest01 {
    public static void main(String[] args) {

//        Arrays对基本数据类型的排序方式
        int[] nums = {2,3,1,54,2,43,2,6,31};
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n----------------------------");

        Person[] peoples = new Person[2];
        peoples[0] = new Person("Bob", 30);
        peoples[1] = new Person("Alice", 20);

//        Arrays对非基本数据类型数组的排序方式

//        第一种：使用比较器的方式
//        Arrays.sort(peoples, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

//        第二种：使用lambda表达式，类似func(Person p1, Person p2){return p1.getAge() - p2.getAge();}
        Arrays.sort(peoples, (p1, p2) -> p1.getAge() - p2.getAge());
        System.out.println(Arrays.toString(peoples));

    }
}
class Person{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}