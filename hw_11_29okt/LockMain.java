package de.telran.hw_11_29okt;

import java.lang.reflect.Array;

public class LockMain {
    // Вам дан замок, состоящий из n различных круглых колец, на каждом из которых
    // последовательно напечатаны цифры от 0 до 9.
    //Изначально все n-колец вместе показывают n-значное целое число, но существует
    // только определенный код, который может открыть замок.
    //Вы можете вращать каждое кольцо любое количество раз в любом направлении.
    //Вы должны найти минимальное количество оборотов на кольцах замка, чтобы открыть замок.

    public static void main(String[] args) {

        int[] start = {2, 2, 2, 2}; // начальная комбинация замка
        int[] kod = {0, 0, 9, 7}; // целевой код

        int result = openLock(start, kod);
        System.out.println("Минимальное количество оборотов: " + result);
    }

    public static int openLock(int[] start, int[] kod) {
        int totalTurns = 0;

        for (int i = 0; i < start.length; i++) {

            // Разница между целевым и текущим значением
            int forwardTurns = (kod[i] - start[i] + 10) % 10; // Поворот вперёд
            int backwardTurns = (start[i] - kod[i] + 10) % 10; // Поворот назад

            // Берём минимальное количество поворотов для данного кольца
            totalTurns += Math.min(forwardTurns, backwardTurns);
        }

        return totalTurns;
    }

}



