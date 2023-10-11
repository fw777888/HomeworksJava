package Lesson2;

public class RecursiveMultiply {
    public static void main(String[] args) {
        int rows = 9; // Количество строк в таблице (от 1 до 9)
        int cols = 9; // Количество столбцов в таблице (от 1 до 9)

        printMultiplyTable(1, 1, rows, cols);
    }

    // Рекурсивная функция для вывода таблицы умножения
    static void printMultiplyTable(int row, int col, int maxRows, int maxCols) {
        if (row > maxRows) {
            return; // если достигнут конец строк, завершаем рекурсию
        }

        int result = row * col;
        System.out.printf("%d * %d = %d%n", row, col, result);

        // Переход к следующему столбцу или следующей строке
        if (col < maxCols) {
            printMultiplyTable(row, col + 1, maxRows, maxCols);
        } else {
            System.out.println("------------------------------");
            printMultiplyTable(row + 1, 1, maxRows, maxCols);
        }
    }
}

