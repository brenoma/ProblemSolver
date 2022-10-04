package Leetcode.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandles {

    static int[] param = {4, 2, 1, 1, 2};
    static int greatestNumberOfCandies = 0;

    public static void main(String[] args) {

        System.out.println(kidsWithCandies(param, 1));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> listOfKidsWithCandies = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > greatestNumberOfCandies) greatestNumberOfCandies = candies[i];
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= greatestNumberOfCandies) listOfKidsWithCandies.add(true);
            else listOfKidsWithCandies.add(false);
        }

        return listOfKidsWithCandies;
    }
}
