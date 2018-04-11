package Leetcode;

/**
 * Created by cecillee on 20/11/2016.
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {5, 5 ,0, 0, 0, 0};
        int[] nums2 = {6,6,6,6};
        merge(nums1,2,nums2,4);
        System.out.println(nums1[0]);
    }

    public static void merge(int nums1[], int m, int nums2[], int n) {
        int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;
        while (tail1 >= 0 && tail2 >= 0) {
            nums1[finished--] = (nums1[tail1] > nums2[tail2]) ?
                    nums1[tail1--] : nums2[tail2--];
        }

        while (tail2 >= 0) { //only need to combine with remaining nums2
            nums1[finished--] = nums2[tail2--];
        }

    }


//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        boolean asc = true;
//        for(int i=1;i<m;i++)
//        {
//            if(nums1[i-1]==nums1[i])
//            {
//                i++;
//                continue;
//            }
//            if(nums1[i-1]<nums1[i])
//            {
//                asc=true;
//            }
//            else
//            {
//                asc = false;
//            }
//            break;
//        }
//
//        for(int i =m;i>0;i--)
//        {
//            nums1[i-1 +n]=nums1[i-1];
//        }
//
//        for(int index1 = 0,index2 = 0,i=0;index2<n;i++)
//        {
//            if(move(nums1[index1+n],nums2[index2],asc))
//            {
//                nums1[i] = nums2[index2];
//                index2++;
//            }
//            else{
//                nums1[i] = nums1[index1+n];
//                index1++;
//            }
//        }
//    }

    public static boolean move(int num1,int num2,boolean asc)
    {
        boolean res = num1<=num2;
        if(asc)
        {
            return !res;
        }
        else
        {
            return res;
        }
    }
}
