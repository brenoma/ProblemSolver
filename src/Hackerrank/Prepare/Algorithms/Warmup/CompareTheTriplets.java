package Hackerrank.Prepare.Algorithms.Warmup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CompareTheTriplets {
    public static final String PLAYER_1 = "Breno";
    public static final String PLAYER_2 = "Thiago";

    public static void main(String[] args) {
        compareTriplets(List.of(1, 3, 9, 1, 2), List.of(1, 23, 0, 3, 5));
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        HashMap<String, Integer> results = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();
        int playerOneScore = 0;
        int playerTwoScore = 0;
        results.put(PLAYER_1, 0);
        results.put(PLAYER_2, 0);

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i))
                playerOneScore++;

            else if (a.get(i) < b.get(i))
                playerTwoScore++;
        }

        results.replace(PLAYER_1, playerOneScore);
        results.replace(PLAYER_2, playerTwoScore);

        resultList.add(results.get(PLAYER_1));
        resultList.add(results.get(PLAYER_2));

        System.out.println(results);
        System.out.println(resultList);

        return resultList;
    }
}
