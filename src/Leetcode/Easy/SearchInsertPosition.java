package Leetcode.Easy;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = 1;
        nums[1] = 3;
        nums[2] = 5;
        nums[3] = 6;
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = i + 1;
//        }
        System.out.println(searchInsert(nums, 5));
    }

    public static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                return i;
            }
        }

        return nums.length;
    }
}
