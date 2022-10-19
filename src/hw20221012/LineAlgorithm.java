package hw20221012;

import java.util.Arrays;

public class LineAlgorithm {

    public static void main(String[] args) {

        System.out.println("1) Sum: num1 + num2 + num3 = " + sum3params(4, 1, 9));


        int[] array = new int[5];
        array[0] = 25;
        array[1] = 14;
        array[2] = 56;
        array[3] = 15;
        array[4] = 47;

        System.out.println("2.1) Init array : " + Arrays.toString(array));
        array = addIndexItem(array, 3, 5);
        System.out.println("2.2) Inserted item to array : " + Arrays.toString(array));

        System.out.println("3) Max value: " + maxItem(array));

        System.out.println("4) Min value: " + minItem(array));

    }

    public static int sum3params(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }

    public static int[] addIndexItem(int[] array, int index, int item) {

        try {
            int[] array1;
            if (array.length + 1 >= index) {
                array1 = new int[array.length + 1];
            } else {
                array1 = new int[index];
            }

            for (int i = 0; i < array.length; i++) {
                if (i >= index - 1) {
                    array1[i + 1] = array[i];
                } else {
                    array1[i] = array[i];
                }
            }
            array1[index - 1] = item;
            return array1;
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index is out of range! Index: " + index);
            return array;
        }

    }

    public static int maxItem(int[] array){
        int item = Integer.MIN_VALUE;
        for (int i = 0 ; i < array.length; i++) {
            if (item < array[i]) {
                item = array[i];
            }
        }
        return item;
    }

    public static int minItem(int[] array){
        int item = Integer.MAX_VALUE;
        for (int i = 0 ; i < array.length; i++) {
            if (item > array[i]) {
                item = array[i];
            }
        }
        return item;
    }
}

