package Leetcode.Easy;

public class RichestCustomerWealth {
    public static void main(String[] args) {

        int[][] param = new int[3][3];
        param[0][0] = 1;
        param[0][1] = 2;
        param[0][2] = 3;

        param[1][0] = 3;
        param[1][1] = 2;
        param[1][2] = 1;

        param[2][0] = 3;
        param[2][1] = 2;
        param[2][2] = 2;

        System.out.println(maximumWealth(param));
    }

    public static int maximumWealth(int[][] accounts) {
        int maxValue = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                sum+= accounts[i][j];
            }
            if (sum > maxValue) maxValue = sum;
        }

        return maxValue;
    }
}
