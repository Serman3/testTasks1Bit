package org.example;

/*На рисунке выше изображен двумерный массив (матрица). Буквами «г» обозначена
главная диагональ, буквами «п» - побочная. Размер матрицы - N на N элементов
задается пользователем (ширина и высота всегда одинаковые). Необходимо найти
сумму элементов, лежащих на побочной диагонали используя один оператор цикла.*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размеры массива NxN: ");
        int rowsAndColumns = scanner.nextInt();

        int[][] matrix = new int[rowsAndColumns][rowsAndColumns];

        // Заполняем массив
        int count = 1;
        for (int i = 0; i < rowsAndColumns; i++) {
            for (int j = 0; j < rowsAndColumns; j++) {
                matrix[i][j] = count++;
            }
        }

        System.out.println("Сумма элементов на побочной диагонали: " + sumOfSecondaryDiagonal(matrix));
    }

    public static int sumOfSecondaryDiagonal(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) { // проходим по всем элементам матрицы
            sum += matrix[i][n - 1 - i]; // если текущий элемент на побочной диагонали, добавляем его к сумме
        }

        return sum;
    }
}
