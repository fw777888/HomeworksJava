package Lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("   J    a   v     v  a\n");
        System.out.print("   J   a a   v   v  a a\n");
        System.out.print("J  J  aaaaa   V V  aaaaa\n");
        System.out.print(" JJ  a     a   V  a     a\n");

        System.out.print(" +\"\"\"\"\"+\n" + "[| o o |]\n" + " |  ^  |\n" + " | '-' |\n" + " +-----+");

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Простой калькулятор  a, b, c" + "\n" +
                "a - первое число, b - второе число, c - арифметический оператор ");
        System.out.println("введите число a");
        int a = sc.nextInt();
        System.out.println("введите число b");
        int b = sc.nextInt();

        System.out.println("введите один из арифметических операторов + - / *");
        sc.nextLine();
        String c = sc.nextLine();

//        if (c == "/" && b == 0) {
//            System.out.println("на ноль делить нельзя!");
//        }

        int result = 0;

        switch (c) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("введите корректный оператор");
        }
        sc.close();
                System.out.println("result " + a + c + b + "=" + result);
    }
}