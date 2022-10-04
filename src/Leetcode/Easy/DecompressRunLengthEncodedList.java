package Leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

public class DecompressRunLengthEncodedList {

    static int[] param = {65,44,72,15};

    public static void main(String[] args) {
        decompressRLElist(param);
    }

    static public int[] decompressRLElist(int[] nums) {
        List<Integer> decompressedList = new ArrayList<>();
        int i = 0;

        while (i < nums.length) {
            int multiplyValue = nums[i];
            int value = nums[i+1];
            for (int j = 0; j < multiplyValue; j++) {
                decompressedList.add(value);
            }
            i += multiplyValue+1;
        }

        int[] returnStatement = new int[decompressedList.size()];

        for (int j = 0; j < returnStatement.length; j++) {
            returnStatement[j] = decompressedList.get(j);
        }

        System.out.println(decompressedList);

        return returnStatement;
    }
}
