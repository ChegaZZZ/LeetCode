package Easy.RemoveDuplicatesFromSortedList;

public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(
                1, new ListNode(
                1, new ListNode(
                2, new ListNode(
                3, new ListNode(
                3)))));
        System.out.println(deleteDuplicates(head));
    }

    private static ListNode deleteDuplicates(ListNode head) {
        ListNode listNode = head;

        while (listNode != null && listNode.next != null) {
            if (listNode.val == listNode.next.val) {
                listNode.next = listNode.next.next;
            } else {
                listNode = listNode.next;
            }
        }
        return head;
    }
}