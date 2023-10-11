// Написать метод который принимает два массива и возвращает один обьедененный в следующем виде:
//   метод принимает ([1, 2,  3], [4, 5, 6]) возвращает ([1, 4, 2, 5, 3, 6])
package Lesson3;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arrayOne = {1, 2, 3};
        int[] arrayTwo = {4, 5, 6};
        int[] mergedArray = arrayMerge(arrayOne, arrayTwo);
        System.out.println(Arrays.toString(mergedArray));
    }

    static int[] arrayMerge(int[] arrayFirst, int[] arraySecond) {
        int arrayResultLength = arrayFirst.length + arraySecond.length;
        int[] arrayResult = new int[arrayResultLength];

        for (int i = 0; i < arrayResult.length; i++) {
            if (i < arrayFirst.length) {
                arrayResult[i * 2] = arrayFirst[i];
            }
            if (i < arraySecond.length) {
                arrayResult[i * 2 + 1] = arraySecond[i];
            }
        }
        return arrayResult;
    }
}
