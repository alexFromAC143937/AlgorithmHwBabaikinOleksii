package hw20221012;

import java.util.Arrays;

public class LineAlgorithm {

    public static void main(String[] args) {

        System.out.println("1) Sum: num1 + num2 + num3 = " + sum3params(4, 1, 9));


        int[] array = new int[6];
        array[0] = 25;
        array[1] = 14;
        array[2] = 56;
        array[3] = 15;
        array[4] = 47;

        System.out.println("2.1) Init array : " + Arrays.toString(array));
        addIndexItem(array, 3, 5);
        System.out.println("2.2) Inserted item to array : " + Arrays.toString(array));

        System.out.println("3) Max value: " + maxItem(array));

        System.out.println("4) Min value: " + minItem(array));

    }

    public static int sum3params(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }

    public static void addIndexItem(int[] array, int index, int item) {
        try {
            for (int i = array.length - 1; i >= 0; i--) {
                if (i == index - 1) {
                    array[i] = item;
                    break;
                } else {
                    array[i] = array[i - 1];
                }
            }
        }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Incorrect index: " );
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

