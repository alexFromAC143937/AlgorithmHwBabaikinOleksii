package hw20221109;
/*
First level: 1. Даны два целых числа x и n, напишите функцию для вычисления x^n
     решение 1 - рекурсивно O(n)
     решение 2 - улучшить решение 1 до O(lon n)
 */

public class Task1 {

    public static void main(String[] args) {
        System.out.println(nMultM1(2,3));
    }
    public static int nMultM1(int n, int m){
        return (m > 1) ? n*nMultM1(n, --m) : n;
    }
}
