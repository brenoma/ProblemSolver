package Leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {
        int[] param = new int[5];
        param[0] = 3;
        param[1] = 2;
        param[2] = 2;
        param[3] = 3;
        param[4] = 3;

//        removeElement(param, 3);

        int k = removeElement(param, 3);
        System.out.println(k);
    }

    public static int removeElement(int[] nums, int target) {
        List<Integer> resultList = new ArrayList<>();
        int k = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target) {
                resultList.add(nums[i]);
                k--;
            }
        }
        System.out.println(resultList);

        return k;
    }
}
