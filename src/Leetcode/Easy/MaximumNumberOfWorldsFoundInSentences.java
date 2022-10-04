package Leetcode.Easy;

public class MaximumNumberOfWorldsFoundInSentences {

    static String[] param = new String[3];

    public static void main(String[] args) {
        param[0] = "Hi my name is Breno";
        param[1] = "Two sentences";
        param[2] = "Just three sentences";

        mostWordsFound(param);
    }

    public static int mostWordsFound(String[] sentences) {
        int maxSentences = 1;
        int maxThis;

        for (int i = 0; i < sentences.length; i++) {
            maxThis = 1;
            for (char c: sentences[i].toCharArray())
                if (c == ' ')
                    maxThis++;

            if (maxThis > maxSentences)
                maxSentences = maxThis;
        }

        System.out.println(maxSentences);
        return maxSentences;
    }
}
