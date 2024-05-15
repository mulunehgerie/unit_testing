
public class LinkedList {
    ListNode head;

    public void add(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove(int val) {
        if (head == null) {
            return;
        }

        if (head.val == val) {
            head = head.next;
            return;
        }

        ListNode prev = head;
        ListNode current = head.next;
        while (current != null) {
            if (current.val == val) {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public boolean contains(int val) {
        ListNode current = head;
        while (current != null) {
            if (current.val == val) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
