package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        int i;
        for (i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        int i;
        boolean even;
        for (i = start; i <= finish; i++) {
            if (even = i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
