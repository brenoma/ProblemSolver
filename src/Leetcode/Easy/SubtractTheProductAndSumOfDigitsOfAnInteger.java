package Leetcode.Easy;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        subtractProductAndSum(234);
    }

    public static int subtractProductAndSum(int n) {
        return productOfDigits(n) - sumOfDigits(n);
    }

    public static int productOfDigits(int n) {
        int product = 1;
        char[] characters = String.valueOf(n).toCharArray();

        for (int i = 0; i < characters.length; i++) {
            product = product * Character.getNumericValue(characters[i]);
        }
        return product;
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        char[] characters = String.valueOf(n).toCharArray();

        for (int i = 0; i < characters.length; i++) {
            sum+= Character.getNumericValue(characters[i]);
        }
        return sum;
    }
}
