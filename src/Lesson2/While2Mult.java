package Lesson2;
public class While2Mult {
    public static void main(String[] args) {
        int numOne = 9; // Количество строк в таблице (от 1 до 9)
        int numTwo = 9; // Количество столбцов в таблице (от 1 до 9)

        int currentNumOne = 1;

        while (currentNumOne <= numOne) {
            int currentNumTwo = 1;

            while (currentNumTwo <= numTwo) {
                int result = currentNumOne * currentNumTwo;
                System.out.printf("%d * %d = %d%n", currentNumOne, currentNumTwo, result);
                currentNumTwo++;
            }

            if (currentNumOne < numOne) {
                System.out.println("------------------------------");
            }

            currentNumOne++;
        }
    }
}
