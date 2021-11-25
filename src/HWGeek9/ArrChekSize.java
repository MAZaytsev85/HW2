package HWGeek9;

public class ArrChekSize {

    public static int arrChekSum(String[][] arr) {
        if (arr.length != 4) {
            throw new MyArraySizeException("Arr is not 4x4");
        }
        int sum = 0;
        for (int y = 0; y < arr.length; y ++) {
            if (arr[y].length != 4) {
                throw new MyArraySizeException("Arr is not 4x4");
            }
            for (int x = 0; x < arr[y].length; x++) {
                try {
                    sum += Integer.parseInt(arr[y][x]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Wrong data format");
                }
            }
        }
        System.out.println("arrChekSum = " + sum);
        return sum;
    }
}
