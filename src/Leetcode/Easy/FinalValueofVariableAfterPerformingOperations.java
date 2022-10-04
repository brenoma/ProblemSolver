package Leetcode.Easy;

public class FinalValueofVariableAfterPerformingOperations {
    public static void main(String[] args) {

        String[] param = new String[3];
        param[0] = "--X";
        param[1] = "X++";
        param[2] = "X++";

        System.out.println(finalValueAfterOperations(param));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("X++")) x++;
            else if (operations[i].equals("++X")) ++x;
            else if (operations[i].equals("X--")) x--;
            else if (operations[i].equals("--X")) --x;
        }

        return x;
    }
}
