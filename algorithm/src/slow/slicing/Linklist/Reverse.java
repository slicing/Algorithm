package slow.slicing.Linklist;

public class Reverse {
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
		}
	}
	public static ListNode reverseList(ListNode head){
		ListNode first = head;
		ListNode reverseHead = null;
		while(first != null){
			ListNode second = first.next;
			first.next = reverseHead;
			reverseHead = first;
			first = second;
		}

		return reverseHead;
	}
}
