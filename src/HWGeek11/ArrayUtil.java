package HWGeek11;

import java.util.ArrayList;

public class ArrayUtil {

    public static void replaceElements(Object[] arr, int e1, int e2) {
        Object temp = arr[e1];
        arr[e1] = arr [e2];
        arr[e2] = temp;
    }
    public static <T> ArrayList<T> arrToList(T[] arr) {
        ArrayList<T> result = new ArrayList<T>(arr.length);
        for (T t: arr) {
            result.add(t);
        }
        return result;
    }
}
