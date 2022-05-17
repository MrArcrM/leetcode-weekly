package org.tayg.caiyu;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class SplitListToParts {
    public ListNode[] splitListToParts(ListNode head, int k) {

        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        int quotient = n / k;
        int remainder = n % k;
        ListNode[] list = new ListNode[k];
        ListNode cur = head;
        for (int i = 0; i < k && cur != null; i++) {
            list[i] = cur;
            int len = quotient + (remainder > i ? 1 : 0);
            for (int j = 1; j < len; j++) {
                cur = cur.next;
            }
            ListNode next = cur.next;
            cur.next = null;
            cur = next;

        }

        return list;

    }
}
