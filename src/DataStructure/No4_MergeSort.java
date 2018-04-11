package DataStructure;

/**
 * Created by cecillee on 18/5/2017.
 */
public class No4_MergeSort {

    public static void main(String[] args) {
        int[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
//        int[] a = {5, 2, 4, 1, 3};
        sort(a,0,a.length-1);
        Util.printArray(a);
    }

    private static void sort(int[] a, int begin, int end)
    {
//        if(end > begin)
//        {
//            sort(a, begin, (end + begin) / 2);
//            sort(a, (end + begin) / 2 + 1, end);
//            merge(a, begin, (end+begin)/2+1, end);
//        }
        if(end <= begin)
        {
            return;
        }
        sort(a, begin, (begin+end-1)/2);
        sort(a, (begin+end+1)/2, end);
        merge(a, begin, (begin+end+1)/2, end);

    }

    private static void merge(int[] a, int left, int right, int end)
    {
        int[] tempA = new int[ end-left+1 ];
        int leftEnd = right - 1;
        int i = 0;
        for(; left <= leftEnd && right <= end; i++)
        {
            if(a[right] < a[left])
            {
                tempA[i] = a[right++];
            }
            else
            {
                tempA[i] = a[left++];
            }
        }
        while(left<=leftEnd)
            tempA[i++] = a[left++];
        while(right<=end)
            tempA[i++] = a[right++];
        for(int temp = tempA.length-1; temp > -1; temp--)
        {
            a[end] = tempA[temp];
            end--;
        }
    }

}
