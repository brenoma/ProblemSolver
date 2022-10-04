package Leetcode.Medium;

public class MergeNodesBetweenZero {
    public static void main(String[] args) {
        ListNode n7 = new ListNode(0);
        ListNode n6 = new ListNode(3, n7);
        ListNode n5 = new ListNode(1, n6);
        ListNode n4 = new ListNode(0, n5);
        ListNode n3 = new ListNode(4, n4);
        ListNode n2 = new ListNode(5, n3);
        ListNode n1 = new ListNode(2, n2);
        ListNode node = new ListNode(0, n1);

        mergeNodes(node);
    }

    public static ListNode mergeNodes(ListNode head) {
        boolean zeroStartFlag, zeroEndFlag;
        int sum = 0;
        ListNode clonedNode = head;
        ListNode mergedNode = new ListNode();

        while (clonedNode.next != null) {
            if (clonedNode.val == 0) zeroStartFlag = true;
            sum += clonedNode.val;
            clonedNode = clonedNode.next;
        }

        return mergedNode;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
