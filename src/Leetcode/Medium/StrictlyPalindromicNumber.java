package Leetcode.Medium;

public class StrictlyPalindromicNumber {

    static StringBuilder valueAsString = new StringBuilder("");

    public static void main(String[] args) {

        System.out.println(isStrictlyPalindromic(4));
    }

    public static boolean isStrictlyPalindromic(int n) {
        StringBuilder valueAsString = convertDecimalToBinary(n);
        StringBuilder valueReversed = new StringBuilder();

        for (int i = valueAsString.length() - 1; i >= 0; i--) {
            valueReversed.append(valueAsString.charAt(i));
        }

        if (valueAsString.compareTo(valueReversed) == 0) return true;

        return false;
    }

    public static StringBuilder convertDecimalToBinary(int value) {
        if (value > 0) {
            convertDecimalToBinary(value / 2);
            valueAsString.append(value % 2);
        }
        return valueAsString;
    }
}
