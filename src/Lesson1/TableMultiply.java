// сканнер, является ли числа допустимыми, таблица умножения, метод 2 числа не больше 20

// С помощью сканера считать 2 числа, числа не должны превышать значение 20. Их необходимо проверить с помиощью if
//        Если числа не превышают необходимо вызвать метод которых создаст таблицу умножения и распечатает ее
//        (допустим числа 10 и 10 создается таблица от 1 до 10 и перемножает от 1 до 10)
package Lesson1;

import java.util.Scanner;

public class TableMultiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число, в диапазоне от 1 до 20");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число, в диапазоне от 1 до 20");
        int num2 = scanner.nextInt();

        if (num1 < 1 || num1 > 20 || num2 < 1 || num2 > 20) {
            System.out.println("введите корректные значения");
        } else { printMultiplyTable(num1, num2);
        }
    }

    static void printMultiplyTable(int a, int b) {
        int result;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
                System.out.println("------------------------------");
        }
    }

}
