package base.learn;

//测试两个数组是否相等（元素相等）

import java.util.Arrays;

public class ArraysTest03 {
    public static void main(String[] args) {
//        比较基本类型数组
        int[] nums1 = {1,2,3};
        int[] nums2 = {1,2,3};

        System.out.println(Arrays.equals(nums1,nums2));

//        比较对象数组
        String[] str1 = {"a","b","c"};
        String[] str2 = {"a","b","c"};
        System.out.println(Arrays.equals(str1,str2));

//        比较多维数组（使用deepequals）
        int[][] num3 = {{1,2,3},{4,5,6}};
        int[][] num4 = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepEquals(num3,num4));
    }
}
