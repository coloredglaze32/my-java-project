package base.learn;

//测试转换数组

import java.util.Arrays;
import java.util.List;

public class ArraysTest05 {
    public static void main(String[] args) {
//        数组转换为List
        String[] arr = {"apple", "banana", "cherry"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list);

//        数组转换为stream
        Arrays.stream(arr).filter(s -> s.startsWith("a")).forEach(System.out::println);
    }
}
