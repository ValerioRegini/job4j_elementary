package ru.job4j.training;

class Sorted {
    public static void printCrossEl(int[] left, int[] right) {
        for (int i = 0; i < left.length; i++) {
            for (i = 0; i < right.length; i++) {
                if (left[i] == right[i]) {
                    System.out.println(right[i]);
                }
            }
        }
    }
}