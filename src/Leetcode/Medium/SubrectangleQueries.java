package Leetcode.Medium;

public class SubrectangleQueries {
    int[][] rectangle;

    public static void main(String[] args) {

        int[][] param = new int[4][3];
        param[0][0] = 1;
        param[0][1] = 2;
        param[0][2] = 3;

        param[1][0] = 4;
        param[1][1] = 5;
        param[1][2] = 6;

        param[2][0] = 7;
        param[2][1] = 8;
        param[2][2] = 9;

        param[3][0] = 10;
        param[3][1] = 11;
        param[3][2] = 12;

        SubrectangleQueries rectangle = new SubrectangleQueries(param);

//        System.out.println(rectangle.getValue(0,0));
        rectangle.printRectangle();
        rectangle.updateSubrectangle(1, 0, 3, 2, 5);
        rectangle.printRectangle();
//        System.out.println(rectangle.getValue(3, 3));
    }

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                this.rectangle[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return this.rectangle[row][col];
    }

    public void printRectangle() {
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[0].length; j++) {
                System.out.print(rectangle[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
