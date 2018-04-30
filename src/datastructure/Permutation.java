package datastructure;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Permutation {

    static List<List<Integer>> result = new ArrayList<>();
    static int i = 0;

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Arrays.sort(nums);
        List<List<Integer>> list = permutation(nums);
        System.out.println(list.toString());
        System.out.println(i);
    }

    private static List<List<Integer>> permutation(int[] nums) {
//        DFS(nums, 0);

        List<Integer> list = new ArrayList<>();
        backTracking(nums, list);
        return result;
    }

    private static void DFS(int[] nums, int index) {
        if(index == nums.length-1) {
            result.add(getList(nums));
            return;
        }

        for(int i = index; i<nums.length; i++) {
            swap(nums, index, i);
            DFS(nums, index + 1);
            swap(nums, index, i);
        }
    }

    private static List<Integer> getList(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        return list;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void backTracking(int[] nums, List<Integer> list) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int num : nums) {
            if (list.contains(num)) {
                continue;
            }
            list.add(num);
            backTracking(nums, list);
            //reset
            list.remove(list.size() - 1);
        }
    }

}
