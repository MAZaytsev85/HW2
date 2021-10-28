package HWGeek2;



public class HWGeek2 {

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 1, 1, 0};
        int[] arr2 = new int[8];
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] arr4 = new int[6][6];
        //changeArray(arr);
        //stepArray(arr2);
        //countArray(arr3);
       //diagonalArray(arr4);

    }

    public static void changeArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                arr[i] -= 1;
            } else if (arr[i] == 0) {
                arr[i] += 1;
            }
            System.out.println(arr[i]);
        }
    }

    public static void stepArray(int[] arr2) {

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;

            System.out.println(arr2[i]);
        }
    }

    public static void countArray(int[] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
            System.out.println(arr3[i]);
        }
    }

    static void diagonalArray(int[][] arr4) {

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                arr4[i][i] = arr4.length;
                arr4[i][arr4.length - i - 1] = arr4.length;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
    }
}
