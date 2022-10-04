package Leetcode.Easy;

public class SmallestEvenNumber {
    public static void main(String[] args) {

        System.out.println(smallestEvenMultiple(6));
    }

    public static int smallestEvenMultiple(int n) {
        int result = 1;

        while (result % n != 0 || result % 2 != 0) {
            result++;
        }

        return result;
    }
}
