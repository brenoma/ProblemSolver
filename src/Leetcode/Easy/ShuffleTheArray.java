package Leetcode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ShuffleTheArray {

    static int[] param1 = {2, 5, 1, 3, 4, 7};
    static int n1 = 3;

    static int[] param2 = {1, 2, 3, 4, 4, 3, 2, 1};
    static int n2 = 4;

    static int[] param3 = {1, 1, 2, 2};
    static int n3 = 2;

    public static void main(String[] args) {

        shuffle(param1, n1);
        shuffle(param2, n2);
        shuffle(param3, n3);
    }

    public static int[] shuffle(int[] nums, int n) {
        List<Integer> list = new ArrayList<>();
        int[] result;

        for (int i = 0; i < n; i++) {
            list.add(nums[i]);
            list.add(nums[i+n]);
        }
        System.out.println(list);

        result = list.stream().mapToInt(e -> e).toArray();

        return result;
    }
}
