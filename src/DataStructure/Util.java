package DataStructure;

/**
 * Created by cecillee on 18/5/2017.
 */
public class Util {

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length ; i++){
            System.out.println(a[i]);
        }
    }

}
