package HWGeek9;

public class MainArrExept {
    public static void main(String[] args) {
        String[][] arr1 = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "b", "11", "12"},
                {"13", "14", "15", "16"}};

        String[][] arr2 = new String[][]{
                {"1", "2", "3", "4", "6"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};

        String[][] arr3 = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};

        try {
            ArrChekSize.arrChekSum(arr1);
        } catch (MyArrayDataException e) {
            e.printStackTrace();

        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        try {
            ArrChekSize.arrChekSum(arr2);
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());

        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());

        }
        try {
            ArrChekSize.arrChekSum(arr3);
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());

        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
            ;
        }
    }
}