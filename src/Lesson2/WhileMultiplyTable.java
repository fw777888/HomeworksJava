
// 2. Вывести таблицу умножения с помощью while
// отдельно рекурсии
package Lesson2;

public class WhileMultiplyTable {
    public static void main(String[] args) {
        int row = 1;

        while (row < 10) {
            int column = 1;

            while (column < 10) {
                int result = row * column;
                System.out.print(result + "\t"); // Вывод с табуляцией для выравнивания
                column++;
            }

            System.out.println();
            row++;
        }
    }
}
