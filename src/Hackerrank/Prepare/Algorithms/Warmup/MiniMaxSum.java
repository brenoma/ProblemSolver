package Hackerrank.Prepare.Algorithms.Warmup;

import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {
        miniMaxSum(List.of(256741038, 623958417, 467905213, 714532089, 938071625));
    }

    public static void miniMaxSum(List<Integer> arr) {
        long firstSum = 0;
        long secondSum = 0;
        long minValue = 0, maxValue = 0;

        for (int i = 0; i < arr.size(); i++) {
            firstSum+= arr.get(i); secondSum+= arr.get(i);
            if (arr.get(i) >= maxValue) maxValue = arr.get(i);
            if (arr.get(i) <= minValue || minValue == 0) minValue = arr.get(i);
        }
        firstSum -= maxValue;
        secondSum -= minValue;

        System.out.println(firstSum + " " + secondSum);
    }
}
