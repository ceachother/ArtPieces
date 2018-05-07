package sort.algorithm;

/**
 * Created by cecillee on 17/5/2017.
 * ave nlogn
 * worst n^2
 */
//partition-exchange sort
public class No5_QuickSort {

    public static void main(String[] args) {
        int[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
//        int[] a = {5, 2, 4, 1, 3};
        sort(a, 0, a.length - 1);
        Util.printArray(a);
    }

    private static void sort(int[] a, int left, int right)
    {
        if (left >= right) {
            return;
        }
        //1.Pick an element, called a pivot, from the array.
        // j is the location that the pivot will locate eventually
        int pivot = a[left];
        int j = left+1;
        //2.Partitioning: reorder the array so that all elements with values less
        // than the pivot come before the pivot, while all elements with values greater
        // than the pivot come after it (equal values can go either way). After this
        // partitioning, the pivot is in its final position. This is called the partition operation.
        for (int i = left + 1; i <= right; i++) {
            if (a[i] < pivot) {
                // put the smaller in order after the pivot.
                Util.swap(a, i, j++);
            }
        }
        // swap the pivot and the last value that less than the pivot
        // to make sure that all elements with values less than the
        // pivot come before the pivot.
//        Util.swap(a, j, pivot);

        //3.Recursively apply the above steps to the sub-array of elements with smaller values and
        // separately to the sub-array of elements with greater values.

        // j-1 is the pivot,
        // j-2 is the value before the pivot
        // j is the value after the pivot
        sort(a, left, j-2);
        sort(a, j, right);

    }

    private static void sortWithMidPivot(int[] a, int left, int right)
    {
        if (left >= right) {
            return;
        }
        //1.Pick an element, called a pivot, from the array.
        int middle = (left+right)/2;
        int pivot = a[middle];
        int j = right;
        int i = left;
        //2.Partitioning: reorder the array so that all elements with values less
        // than the pivot come before the pivot, while all elements with values greater
        // than the pivot come after it (equal values can go either way).
        while (i <= j) {
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            // have to use equals in this statement
            //if is(int[] a, 1, 2), so left is 1 and right is 2, then the pivot is at 1
            //so a[1] is not less than pivot, i won't plus 1,
            //but a[2] is grater than pivot, j will minus 1,
            //then both i and j are 1, and the recursion will go into (int[] a, 1, 0) and (int[] a, 1, 2)
            //the first will return, but the second will be just like this original one and run forever
            if (i <= j) {
                Util.swap(a, i, j);
                i++;
                j--;
            }
        }
        //3.Recursively apply the above steps to the sub-array of elements with smaller values and
        // separately to the sub-array of elements with greater values.

        // i-1 is the pivot,
        // i-2 is the value before the pivot
        // i is the value after the pivot
        sort(a, left, i-1);
        sort(a, i, right);

    }
}
