package Leetcode.Easy;

public class NumberOfGoodPairs {

    static int[] param = {1,2,3};

    public static void main(String[] args) {

        numIdenticalPairs(param);
    }

    public static int numIdenticalPairs(int[] nums) {
        int numberOfPairs = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) numberOfPairs++;
            }
        }
        System.out.println(numberOfPairs);

        return numberOfPairs;
    }
}
