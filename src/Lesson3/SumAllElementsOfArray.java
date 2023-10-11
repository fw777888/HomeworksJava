// Написать метод который принимает целочисленный массив и возвращает его сумму всех элементов
package Lesson3;

public class SumAllElementsOfArray {
    public static void main(String[] args) {
        System.out.println(sumArrElements(new int[]{-1, 2, 0, 38, -8}));
    }
    static int sumArrElements(int[] someArray) {
        int sumOfAllElements = 0;
        for (int i = 0; i < someArray.length ; i++) {
            sumOfAllElements += someArray[i];
        }
        return sumOfAllElements;
    }
}
