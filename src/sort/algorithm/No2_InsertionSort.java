package sort.algorithm;

/**
 * Created by cecillee on 17/5/2017.
 */
public class No2_InsertionSort {

    public static void main(String[] args) {
        int[] a = {5, 2, 4, 1, 3};
        sort(a);
        Util.printArray(a);
    }

    public static void sort(int[] a) {
        for(int i = 1; i< a.length; i++) {
            //i represents a new card
            for (int j = 0; j < i; j++) {
                if (a[j] > a[i]) {
                    Util.swap(a, i, j);
                }
            }
        }
    }


}
