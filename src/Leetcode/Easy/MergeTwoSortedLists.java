package Leetcode.Easy;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(2, l1);
        ListNode l3 = new ListNode(1, l2);

        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(3, l4);
        ListNode l6 = new ListNode(4, l5);



        mergeTwoLists(l3, l6);
    }

    public static ListNode mergeTwoLists(ListNode node, ListNode node2) {
        ListNode listNode = new ListNode();

        if (node.val <= node2.val) listNode.val = node.val;

        return listNode;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        public boolean hasNext() {
            if (next == null) return false;

            return true;
        }
    }
}


