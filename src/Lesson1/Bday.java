//    Программа должна принимать дату рождения человека
//    (реализовать можно как одним считыванием так и несколько)
//    и выводит сколько человек прожил дней до дня 1.10.2023.
//    Високосные дни не учитываем, все месяцы по 30 дней,
//    вывести информацию нужно в формате:
//    Вы родились :дата с даты вашего рождения до 1.10.2023
//    прошло :количество дней
package Lesson1;

import java.util.Scanner;

public class Bday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
комиты удаляем //         scanner.useDelimiter("\\.");

        System.out.println("Введите дату рождения в формате dd.mm.yyyy"); отступы между методами и обьявлением переменных
        String bDate = scanner.nextLine();
        String[] parts = bDate.split("\\.");

        if (parts.length != 3) { 
            System.out.println("некорректный формат ввода даты");
            return;
        } отступы
        int bDay, bMonth, bYear;

        bDay = Integer.parseInt(parts[0]);
        bMonth = Integer.parseInt(parts[1]);
        bYear = Integer.parseInt(parts[2]);

        int currentDay = 1;
        int currentMonth = 10;
        int currentYear = 2023;

        if (bDay > 0 && bDay < 31 && bMonth > 0 && bMonth < 13 && bYear <= currentYear ) { слишком сложно упрости на шаги
            System.out.println("дата рождения " + bDay + "." + bMonth + "." + bYear);
        } else {
            System.out.println("некорректная дата");
        }
        scanner.close();

        int daysInYear = 12 * 30;
        int daysUntilEndOfMonth = 30 - bDay;
        int monthsUntilEndOfYear = 12 - bMonth;
        int daysFromCurrentDateToEndOfCurrentYear = daysInYear - (currentDay + (currentMonth - 1) * 30);
        int yearsUntilCurrentYear = currentYear - bYear;

        int daysUntilCurrentDate =
                yearsUntilCurrentYear * daysInYear
                        + monthsUntilEndOfYear * 30 + daysUntilEndOfMonth - daysFromCurrentDateToEndOfCurrentYear; на шаги

        System.out.println("прошло " + daysUntilCurrentDate + " дней");
    }
}
