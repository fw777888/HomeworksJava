package Lesson1;
import java.util.Scanner;

public class SimpleInRang {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scan.nextInt();
        System.out.println("Введите второе число");
        int b = scan.nextInt();
        int kol = simpleInRange(a, b);
        System.out.println("количество = " + kol);
    }

    static int simpleInRange(int num1, int num2) {
        if (num1 > num2) {
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        if (num2 < 2) {
            return 0;
        }
        int count = 0;
        for (int i = num1; i <= num2; i++) {
            if (num2 % i == 0) {
                return 0;
            } ++count;
        }
        return count;
    }

}


