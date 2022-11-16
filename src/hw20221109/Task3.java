package hw20221109;
/*
Имея отсортированный массив arr[] и число x, напишите функцию, которая подсчитывает вхождения x в arr[]. Ожидаемая временная сложность O(Log n)
arr[] = {1, 1, 2, 2, 2, 2, 3,}
x = 2
Вывод: 4 раза
 */

public class Task3 {

    int[] arrM = {1, 1, 2, 2, 2, 2, 3};

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        int left = task3.binarySearch(task3.arrM, 2, 0);
        int right = task3.binarySearch(task3.arrM, 2, 1);

        System.out.println(left < 0 ? -1 : right - left + 1 );
    }

    public int binarySearch(int[] arr, int number, int left0right1){

        int i = 0;
        int j = arr.length - 1;
        int z=-1;

        while(i <= j && i >= 0 && j < arr.length){
            int k = i+(j-i)/2;
            if(arr[k] < number){
                i = k+1;
                continue;
            }

            if(arr[k] > number){
                j = k-1;
                continue;
            }

            if(arr[k] == number){
                z = k;
                if(left0right1 == 0){
                    j = k-1;
                }else{
                    i = k+1;
                }
            }
        }
        return z;
    }
}