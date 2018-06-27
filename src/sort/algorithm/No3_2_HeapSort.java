package sort.algorithm;

/**
 * Created by cecillee on 18/5/2017.
 * build max heap in every iteration
 * nlogn
 */
public class No3_2_HeapSort {

    public static void main(String[] args) {
        int[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        sort(a);
        Util.printArray(a);
    }

    private static void sort(int[] a)
    {
        for(int i = a.length-1 ; i > 0; i--)
        {
            //build the maximum heap
            buildMaxHeap(a,i);
            //swap the top element of heap to the last
            Util.swap(a,0,i);
        }
    }

    private static void buildMaxHeap(int[] a , int lastPtr)
    {
        for(int i = lastPtr; i > 0 ; i--)
        {
            //start from the last node and its parent
            int parent = (i-1)/2;
            int child;
            //if parent swap with the child, the child should compare to its child
            //parent*2+1(which is his left child) can not over the size of the heap(the array)
            for (; parent * 2 + 1 < lastPtr; parent = child) {
                child = parent * 2 + 1;
                //if the left child is the last element(which child = lastPtr)
                //then left child is the largest child
                if (child < lastPtr &&
                        a[child + 1] > a[child]) {
                    child++;
                }
                if (a[child] > a[parent]) {
                    Util.swap(a, child, parent);
                }
                //if parent is the largest, then no need to build the maximum child heap
                //because the process is from bottom to top, so the children are already
                //bigger than their children
                else {
                    break;
                }
            }
        }
    }

}
