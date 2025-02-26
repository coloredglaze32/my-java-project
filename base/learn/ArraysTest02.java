package base.learn;

import java.util.Arrays;

//测试Arrays工具类的二分查找（数据必须是有序的）

public class ArraysTest02 {
    public static void main(String[] args) {
        Student[] people = {new Student("bob",30), new Student("alice", 20)};

        Arrays.sort(people, (s1,s2) -> (s1.getName().compareTo(s2.getName())));
        System.out.println(Arrays.toString(people));

//        定义查找标准：只要名字相同即为命中
        Student target = new Student("bob", 0);
        int pos = Arrays.binarySearch(people, target, (s1, s2) -> (s1.getName().compareTo(s2.getName())));
        System.out.println("pos : " + pos);
    }
}

class Student{
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
