package Lesson1;

import java.util.Scanner;

public class EqualsLessMore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("сравнение двух чисел");
        System.out.println("Введите первое число");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println(num1 + " = " + num2 + " числа равны");
        } else if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " < " + num2);
        }
        sc.close();
    }
}
