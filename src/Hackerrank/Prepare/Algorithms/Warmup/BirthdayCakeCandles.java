package Hackerrank.Prepare.Algorithms.Warmup;

import java.util.List;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        birthdayCakeCandles(List.of(3, 2, 1, 3, 3));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        int maxHeight = 0;
        int numberOfCandles = 0;

        for (Integer candle: candles) {
            if (candle > maxHeight) {
                maxHeight = candle;
                numberOfCandles = 1;
            } else if (candle == maxHeight) {
                numberOfCandles += 1;
            }
        }

        System.out.println(numberOfCandles);

        return numberOfCandles;
    }
}
