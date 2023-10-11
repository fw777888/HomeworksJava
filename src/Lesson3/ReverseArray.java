// Написать метод который принимает массив и вовращает его в развернутом виде(написать нужно
//   свою логику не прибегая к уже готовым решениям)

package Lesson3;

public class ReverseArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] reversedArray = reverseArray(originalArray);
        printArray(reversedArray);
    }

    static int[] reverseArray(int[] array) {
        int length = array.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[length - 1 - i] = array[i];
        }

        return reversedArray;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
