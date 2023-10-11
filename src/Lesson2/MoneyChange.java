//3. Написать метод, который будет принимать 2 значения: цену покупки и купюру,
// которую дает нам покупатель. ваша задача вывести в консоль
// сколько и каких купюр вы ему дали (в вашем распоряжении весь диапазон купюр рублей)

package Lesson2;

public class MoneyChange {
    public static void main(String[] args) {
        int price = 11234; // Цена покупки
        int paymentAmount = 15000; // Сумма, которую дал покупатель

        giveChange(price, paymentAmount);
    }

    static void giveChange(int price, int paymentAmount) {
        int change = paymentAmount - price;

        if (change < 0) {
            System.out.println("Ошибка: недостаточно средств.");
            return;
        }

        System.out.println("Сдача: " + change + " руб.");

        int[] money = {5000, 2000, 1000, 500, 200, 100, 50, 10, 5, 2, 1};
        int[] numOfMoney = new int[money.length]; // Массив для количества купюр и монет каждого номинала

        for (int i = 0; i < money.length; i++) {
            if (change >= money[i]) {
                numOfMoney[i] = change / money[i];
                change -= numOfMoney[i] * money[i];
            }
        }

        for (int i = 0; i < money.length; i++) {
            if (numOfMoney[i] > 0) {
                System.out.println(money[i] + " руб.: " + numOfMoney[i] + " шт.");
            }
        }
    }

}
