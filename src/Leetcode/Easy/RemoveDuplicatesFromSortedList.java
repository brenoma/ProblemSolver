package Leetcode.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        ListNode l0 = new ListNode(0);
        ListNode l1 = new ListNode(1, l0);
        ListNode l2 = new ListNode(2, l1);
        ListNode l3 = new ListNode(2, l2);
        ListNode l4 = new ListNode(5, l3);

        deleteDuplicates(l4);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode result = new ListNode();
        List<Integer> list = new ArrayList<>();

        while (head.next != null) {
            list.add(head.val);
            head = head.next;
        }

        list = list.stream()
            .distinct()
            .collect(Collectors.toList());

        for (int i = 0; i < list.size(); i++) {
            result.next = new ListNode(list.get(i));
            result = result.next;
            System.out.println(result.val);
        }

        System.out.println(list);

        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}


