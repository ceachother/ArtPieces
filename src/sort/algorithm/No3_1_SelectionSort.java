package sort.algorithm;

/**
 * Created by cecillee on 18/5/2017.
 */
public class No3_1_SelectionSort {

    public static void main(String[] args) {
        int[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        sort(a);
        Util.printArray(a);
    }

    private static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            //find the minimum element from (i+1)-th to the last element
            int minIndex = getMinIndex(a,i);
            Util.swap(a, i, minIndex);
        }
    }

    /**
     * @param a array
     * @param index index
     * @return
     */
    private static int getMinIndex(int[] a, int index) {
        int min = a[index];
        int minIndex = index;
        for (int i = index+1; i<a.length ; i++) {
            if (a[i] < min) {
                minIndex = i;
                min = a[minIndex];
            }
        }
        return minIndex;
    }
}
