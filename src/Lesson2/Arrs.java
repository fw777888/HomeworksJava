package Lesson2;

import java.util.Arrays;

// 1 d string [5]
public class Arrs {
    public static void main(String[] args) {
        String[][] str = new String[3][3];
        str[0][0] = "Один";
        str[0][1] = "Два";
        str[0][2] = "Три";
        str[1][0] = "Четыре";
        str[1][1] = "Пять";
        str[1][2] = "Шесть";
        str[2][0] = "Семь";
        str[2][1] = "Восемь";
        str[2][2] = "Девять";
//        for (int i = 0; i < str.length; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(str[i][j] + " ");
//            }
//                System.out.println();
//
//        }
//        System.out.println();
        System.out.println(Arrays.deepToString(str));

        String[] str2 = {"One", "Two", "Three", "Four", "Five"};
        System.out.println(Arrays.toString(str2));

        int[][] nums = new int[5][];
        nums[0] = new int[]{1,2,3,4,5};
        nums[1] = new int[]{1,2,3,4};
        nums[2] = new int[]{1,2,3};
        nums[3] = new int[]{1,2};
        nums[4] = new int[]{1};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
