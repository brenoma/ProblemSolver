package Leetcode.Easy;

public class GoalParserInterpretation {
    public static void main(String[] args) {

        interpret("G()(al)");
    }

    static public String interpret(String command) {
        StringBuilder resultIntercept = new StringBuilder("");
        char[] charMapping = command.toCharArray();

        for (int i = 0; i < charMapping.length; i++) {
            if (charMapping[i] == 'G') resultIntercept.append('G');
            else if (charMapping[i] == '(' && charMapping[i+1] == ')') {
                resultIntercept.append('o');
            }
            else if (charMapping[i] == '(' && charMapping[i+1] == 'a' && charMapping[i+2] == 'l' && charMapping[i+3] == ')') {
                resultIntercept.append("al");
            }
        }

        return resultIntercept.toString();
    }
}
