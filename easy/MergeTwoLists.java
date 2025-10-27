package easy;

class ListNode {
  int val; // stores data
  ListNode next; // pointer to next node

  ListNode(int val) {
    this.val = val;
    this.next = null; // by default points to nothing
  }
}

public class MergeTwoLists {
  public static void main(String[] args) {
    ListNode head1 = new ListNode(1);
    head1.next = new ListNode(2);
    head1.next.next = new ListNode(4);

    ListNode head2 = new ListNode(1);
    head2.next = new ListNode(3);
    head2.next.next = new ListNode(4);
    
    printNode(mySolution(head1, head2));

  }

  static ListNode mySolution(ListNode list1, ListNode list2) {
    ListNode dummy = new ListNode(0);
    ListNode current = dummy;
    while (list1 != null && list2 != null) {
      if (list1.val <= list2.val) {
        current.next = list1;
        list1 = list1.next;
      } else {
        current.next = list2;
        list2 = list2.next;
      }
      current = current.next;
    }
    if (list1 != null) current.next = list1;
    if (list2 != null) current.next = list2;
    return dummy.next;
  }



  static void printNode(ListNode head){
    while (head != null) {
      System.out.print(head.val);
      if (head.next != null) {
        System.out.print(" -> ");
      }
      head = head.next;
    }
  }
}
