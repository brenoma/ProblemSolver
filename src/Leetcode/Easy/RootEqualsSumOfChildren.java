package Leetcode.Easy;

public class RootEqualsSumOfChildren {

    public static void main(String[] args) {

        TreeNode left = new TreeNode(6);
        TreeNode right = new TreeNode(4);
        TreeNode node = new TreeNode(10, left, right);

        System.out.println(checkTree(node));
    }

    public static boolean checkTree(TreeNode root) {

        if (root.val == root.left.val + root.right.val) return true;

        return false;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
