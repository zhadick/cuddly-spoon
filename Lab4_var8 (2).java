/** @author: Zhadan Sasha, group TZ-91
 * Lab 04, Task 3 ( Var 3)
 * data:03.06.2022
 * */
import java.util.Scanner;
public class Lab4_var8 {
    public static int maxElem(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /** @author: Zhadan Sasha, group TZ-91
     * Lab 04, Task 33 ( Var 3)
     * data:03.06.2022
     * */
    public static int[] newArray(int[] arr) {
        int[] newArr = new int[arr.length];
        int j = 0;
        int max = Lab4_var8.maxElem(arr);
        for (int i : arr) {

            if (i < 0) {
                newArr[j] = i + max;
            } else if (i > 0) {
                newArr[j] = i * 2;
            } else if (i == 0) {
                newArr[j] = 1;
            }
            j++;
        }
        return newArr;
    }

    /** @author: Zhadan Sasha, group TZ-91
     * Lab 04, Task 63 ( Var 63)
     * data:03.07.2022
     * */
    public static void main(String[] args) {
        Lab4_var8 search = new Lab4_var8();
        int[] arr = {2, -500, 200, 2, 3, 0, 7, -56, 32, 3, 14};
        int[] nw = search.newArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(nw[i]);
        }
    }
}
