package DataStructure;

/**
 * Created by cecillee on 17/5/2017.
 */
public class No1_BubbleSort {

    public static void main(String[] args) {
        int[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        sort(a);
        Util.printArray(a);
    }

    public static void sort(int[] a) {
        int length = a.length;
        for (int i = length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    Util.swap(a, j, j + 1);
                }
            }
        }
    }

}
