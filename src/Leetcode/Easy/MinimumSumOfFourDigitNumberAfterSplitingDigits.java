package Leetcode.Easy;

import java.util.Arrays;

public class MinimumSumOfFourDigitNumberAfterSplitingDigits {

    static int param = 2932;

    public static void main(String[] args) {

        System.out.println(minimumSum(param));
    }

    public static int minimumSum(int num) {
        int[]a = new int[4];
        int i = 0;
        while(num>0){
            a[i++]=num%10;
            num/=10;
        }
        Arrays.sort(a);
        return (a[0]*10+a[2]+a[1]*10+a[3]);
    }
}
