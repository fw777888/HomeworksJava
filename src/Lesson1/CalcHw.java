//Реализовать с помощью сканера и switch базовый калькулятор(* / + -)
//    - Ограничить калькулятор значениями чисел от 1 до 9
//    в случае ввода числа больше выдавать ошибку
//    (пример не правильного ввода 11 - 2) (задание со здвездочкой
//    и это условие применяется к 2 калькуляторам(if и switch))
package Lesson1;

import java.util.Scanner;

public class CalcHw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число в диапазоне от 1 до 9");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число в диапазоне от 1 до 9");
        int num2 = scanner.nextInt();
        System.out.println("Введите арифметический оператор (* / + -) ");
        if (num1 > 9 || num1 < 1 || num2 > 9 || num2 < 1) {
            System.out.println("не корректно введены данные, числа должны быть в диапазоне от 1 до 9");
        }
        scanner.nextLine();
        String arifOperator = scanner.nextLine();
        int result = 0;
        if (arifOperator.equals("+")) {
            result = num1 + num2;
        } else if (arifOperator.equals("-")) {
            result = num1 - num2;
        } else if (arifOperator.equals("/")) {
            result = num1 / num2;
        } else if (arifOperator.equals("*")) {
            result = num1 * num2;
        } else {
            System.out.println("Введите корректный арифметический опереатор");
        }
        scanner.close();
        System.out.println("результат равен " + result);
    }
}
