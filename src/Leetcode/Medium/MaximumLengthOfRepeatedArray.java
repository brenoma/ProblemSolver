package Leetcode.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumLengthOfRepeatedArray {
    static int[] param1 = {1,2,3,2,1};
    static int[] param2 = {3,2,1,4,7};

    public static void main(String[] args) {

        findLength(param1, param2);
    }

    static public int findLength(int[] nums1, int[] nums2) {
        List<Integer> array = new ArrayList<>();
        List<Integer> copyOf = new ArrayList<>();

        for (int val: nums1) array.add(val);
        for (int val: nums2) array.add(val);

//        copyOf = array.stream().distinct().collect(Collectors.toList());
        copyOf = array.stream().sorted().collect(Collectors.toList());

        System.out.println(array);
        System.out.println(copyOf);

        return array.size();
    }
}
