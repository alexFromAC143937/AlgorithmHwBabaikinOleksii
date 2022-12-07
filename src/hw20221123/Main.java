package hw20221123;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        DynamicArray ar = new DynamicArray(5);
        ar.add(0);
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        System.out.println("1 " + Arrays.toString(ar.array));
        ar.add(5);
        System.out.println("2 " + Arrays.toString(ar.array));
        System.out.println("3 " + ar.get(4));
        ar.addAt(1, 100);
        System.out.println("4 " + Arrays.toString(ar.array));
        ar.removeAt(1);
        System.out.println("5 " + Arrays.toString(ar.array));
        ar.shrinkSize();
        System.out.println("6 " + Arrays.toString(ar.array));
        ar.set(3, 103);
        System.out.println("7 " + Arrays.toString(ar.array));
        ar.get(3);
        System.out.println("8 " + Arrays.toString(ar.array));
        ar.clear();
        System.out.println("9 " + Arrays.toString(ar.array));
        System.out.println("10 " + ar.contains(103));
        System.out.println("11 " + ar.isEmpty());
    }
}
