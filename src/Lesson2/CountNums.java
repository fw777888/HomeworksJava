// написать метод который принимает 3 числа. Первое число от скольки считать,
//    второе до скольки, третье с каким шагом

package Lesson2;

public class CountNums {
    public static void main(String[] args) {
        countNumbers(2, 20, 2 );
    }

    static void countNumbers(int firstNumber, int lastNumber, int countStep) {
        for (int i = firstNumber; i <= lastNumber; i += countStep) {
            System.out.println(i);
        }
    }
}
