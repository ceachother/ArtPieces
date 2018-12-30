package sort.algorithm;

import static sort.algorithm.Util.swap;

/**
 * Created by cecillee on 18/5/2017.
 * build max heap in every iteration
 * https://stackoverflow.com/questions/9755721/how-can-building-a-heap-be-on-time-complexity
 * nlogn
 */
public class No3_2_HeapSort {

    public static void main(String[] args) {
        int[] a = {3, 41,53,4,54,63,58,47,6,35,24,56,4, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48,1,34,5,43,7,46,83,65,45,15,24,63,4,78,69,48,37,62,4,51,3,42,57,6,47,3,46,5,24,5};
        sort(a);
        Util.printArray(a);
    }

    public static void sort(int[] a) {
        //time complexity for buildHeap is O(n)
        // https://stackoverflow.com/questions/27888321/build-heap-time-complexity-worst-case-vs-upper-bound-tight-upper-bound
        buildHeap(a);

        // O(nlogn)
        for(int i = a.length-1; i>=0; i--) {
            swap(a, i, 0);
            heapify(a, 0, i);
        }
    }

    /**
     * When buiding heap(either max or min),
     * it has to be starting from the bottom to top to achieve time complexity O(n)
     * @param a
     */
    public static void buildHeap(int[] a) {
        for (int i = a.length/2; i>=0; i--) {
            heapify(a, i, a.length);
        }
    }

    public static void heapify(int[] a, int index, int end) {
        int k = index;
        while (k < end) {
            int largest = k;
            if (k * 2 + 1 < end && a[k * 2 + 1] > a[largest]) {
                largest = k * 2 + 1;
            }
            if (k * 2 + 2 < end && a[k * 2 + 2] > a[largest]) {
                largest = k * 2 + 2;
            }
            if (largest == k) break;
            swap(a, largest, k);
            //set k to its child is necessary
            // cause we are building max heap so
            // every parent should be greater than its children
            k = largest;
        }
    }


//    private static void siftdown(int[] A, int k) {
//        while (k < A.length) {
//            int smallest = k;
//            if (k * 2 + 1 < A.length && A[k * 2 + 1] < A[smallest]) {
//                smallest = k * 2 + 1;
//            }
//            if (k * 2 + 2 < A.length && A[k * 2 + 2] < A[smallest]) {
//                smallest = k * 2 + 2;
//            }
//            if (smallest == k) {
//                break;
//            }
//            int temp = A[smallest];
//            A[smallest] = A[k];
//            A[k] = temp;
//
//            k = smallest;
//        }
//    }

//    public static void heapify(int[] A) {
//        for (int i = A.length / 2; i >= 0; i--) {
//            siftdown(A, i);
//        }
//    }
//
//
//    private static void sort(int[] a)
//    {
//        for(int i = a.length-1 ; i > 0; i--)
//        {
//            //build the maximum heap
//            buildMaxHeap(a,i);
//            //swap the top element of heap to the last
//            Util.swap(a, 0, i);
//        }
//    }
//
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
