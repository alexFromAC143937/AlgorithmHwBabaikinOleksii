package hw20221109;

/*
Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент, который будет находиться на k-й позиции в конечном отсортированном массиве.
Массив 1 - 100 112 256 349 770
Массив 2 - 72 86 113 119 265 445 892
к = 7
Вывод : 256
Окончательный отсортированный массив -
72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
7-й элемент этого массива равен 256.
 */

public class Task2 {
    int[] arr1 =  {100,112,256,349,770};
    int[] arr2 = {72,86,113,119,265,445,892};

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        System.out.println(task2.findXelemetYposition(task2.arr1, task2.arr2, 7));
    }

    public int findXelemetYposition(int[] arr11, int[] arr22, int y){
        int position = 0;
        int positionX = 0;
        int positionY = 0;

        while(positionX < arr11.length  || positionY < arr22.length) {

            if (positionX < arr11.length && positionY < arr22.length && arr11[positionX] <= arr22[positionY]
                    || positionX < arr11.length && positionY >= arr22.length){
                position++;
                if (position == y) return arr11[positionX];
                positionX++;
            }
            if (positionX < arr11.length && positionY < arr22.length && arr22[positionY] <= arr11[positionX]
                    || positionX >= arr11.length && positionY < arr22.length){
                position++;
                if(position == y) return arr22[positionY];
                positionY++;
            }
        }
        return -1;
    }
}