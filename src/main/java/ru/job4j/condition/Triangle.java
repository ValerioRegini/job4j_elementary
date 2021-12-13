package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static void main(String[] args) {
        System.out.println(exist(8.0, 4.52, 6.2));
        System.out.println(exist(4.2, 10.0, 5.5));
    }
}
