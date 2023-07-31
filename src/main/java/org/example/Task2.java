package org.example;

 /*Дано два числа. Первое число больше второго. Написать алгоритм, определяющий
   делится ли первое число на второе нацело без использования операций «/», «mod»,
   «%». Операцию округления также запрещено использовать.*/

public class Task2 {
    public static void main(String[] args) {

        System.out.println(isDivisible(10, 3));
        System.out.println(isDivisible(15, 5));
        System.out.println(isDivisible(20, 4));
        System.out.println(isDivisible(13, 7));
    }

    public static boolean isDivisible(int A, int B) {
        if (B == 1) {
            System.out.println("B == 1, значит A делится нацело на B");
            return true;
        }
        int count = 0;
        while (A >= B) {
            A -= B;
            count++;
        }
        if (A == 0) {
            System.out.println("Остаток от деления равен нулю, значит A делится нацело на B");
            return true;
        } else {
            System.out.println("Остаток от деления = " + A + ", значит A не делится нацело на B ");
            return false;
        }
    }

}
