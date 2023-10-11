// Написать метод который принимает ступенчетый целочисленный массив и возвращает его сумму
package Lesson3;

public class SumOfAllElementsDimensionalArray {
    public static void main(String[] args) {
        int[][] arr3D = {{-1, 2, 0, 38, -8},
                         {9, 2, -9},
                         {3, -11, 4, 2}} ;

        System.out.println(sumArrElements(arr3D));
    }
    static int sumArrElements(int[][] someArray) {
        int sumOfAllElements = 0;
        for (int i = 0; i < someArray.length ; i++) {
            for (int j = 0; j < someArray[i].length; j++) {
            sumOfAllElements += someArray[i][j];
            }

        }
        return sumOfAllElements;
    }
}
