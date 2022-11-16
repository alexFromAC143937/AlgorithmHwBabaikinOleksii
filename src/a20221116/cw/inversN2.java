package a20221116.cw;

public class inversN2 {
        // Input:  A[] = [1, 9, 6, 4, 5]
        // The inversion count is 5
        // (9, 6), (9, 4), (9, 5), (6, 4), (6, 5)
        // ((i < j) && arr[i] > arr[j])) == true

        public static void main(String[] args) {
            int[] arr = new int[] {1, 9, 6, 4, 5};
            System.out.println(quadraticInversions(arr));
        }

        static int quadraticInversions(int[] arr) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) count++;
                }
            }
            return count;
        }

        static int linearLogInversions(int[] arr) {
            return 0;
        }
}
