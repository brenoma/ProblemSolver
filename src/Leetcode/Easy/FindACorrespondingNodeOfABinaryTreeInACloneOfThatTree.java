package Leetcode.Easy;

import java.util.List;

public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(19);

//        System.out.println(List.of(root.val, root.left.val, root.left.left.val, root.left.right.val,
//                root.right.val, root.right.left.val, root.right.right.val));

        getTargetCopy(root, root, root);

    }

    public static final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        if (cloned.left != null) System.out.println(cloned.left.val);
        if (cloned.right != null) {
            System.out.println(cloned.right.val);
        }

        return original;
    }

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
}
