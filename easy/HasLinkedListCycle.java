package easy;

class ListNode {
  int val; // stores data
  ListNode next; // pointer to next node

  ListNode(int val) {
    this.val = val;
    this.next = null; // by default points to nothing
  }
}

public class HasLinkedListCycle {
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    printList(head);
    System.out.println(mySolution(head));
  }

  static boolean mySolution(ListNode head) {
    if (head == null) return false;

    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) return true;
    }
    return false;
  }

  static void printList(ListNode node) {
    while (node != null) {
      System.out.print(node.val + " -> ");
      node = node.next;
    }
    System.out.println("null");
  }
}

// A Linked List is a data structure made up of nodes.

// Each node has two parts:
// data — the actual value
// next — a pointer (reference) to the next node in the list

// Unlike arrays:
// Elements are not stored in contiguous memory
// Insertion/deletion is faster
// But accessing the nth element is slower (you must traverse from the start)

// head → [10 | ●-] → [20 | ●-] → [30 | null]
// Each [data | next] is a node.
// The first node (10) is the head
// The last node points to null (means end of list)