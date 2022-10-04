package Leetcode.Easy;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    static int[] param = {8, 1, 2, 2, 3};

    public static void main(String[] args) {


        smallerNumbersThanCurrent(param);
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smallerNumbers = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) smallerNumbers[i]++;
            }
        }

        return smallerNumbers;
    }
}
