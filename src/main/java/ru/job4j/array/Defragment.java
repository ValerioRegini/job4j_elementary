package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) { //перебирает массив и
            if (array[index] == null) {                      //находит null
                for (int i = index + 1; i < array.length; i++) {
                    if (array[i] != null) {                  //во втором цикле идет дальше по массиву,
                        array[index] = array[i];             //находит не null, меняет их местами,
                        array[i] = null;                     //выходит из второго цикла
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
