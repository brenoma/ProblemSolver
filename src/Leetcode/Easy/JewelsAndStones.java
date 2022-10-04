package Leetcode.Easy;

public class JewelsAndStones {
    public static void main(String[] args) {

        numJewelsInStones("aA", "aAAbbbb");
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int numJewelsInStones = 0;
        char[] jewelsType = jewels.toCharArray();
        char[] stonesType = stones.toCharArray();

        for (int i = 0; i < stonesType.length; i++) {
            for (int j = 0; j < jewelsType.length; j++) {
                if (stonesType[i] == jewelsType[j]) numJewelsInStones++;
            }
        }

        System.out.println(numJewelsInStones);
        return numJewelsInStones;
    }
}
