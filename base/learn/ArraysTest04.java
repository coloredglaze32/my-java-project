package base.learn;

//测试填充数组

import java.util.Arrays;

public class ArraysTest04 {
    public static void main(String[] args) {
//        基本类型数组的填充
        int[] intArray = new int[10];
        Arrays.fill(intArray, 5);
        System.out.println(Arrays.toString(intArray));

//        对象数组的填充
        String[] stringArray = new String[10];
        Arrays.fill(stringArray, "hello");
        System.out.println(Arrays.toString(stringArray));
    }
}
