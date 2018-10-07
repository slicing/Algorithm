package slow.slicing.Linklist;
//给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
public class RemoveLastList {
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}
	public ListNode removeNthFromEnd(ListNode head,int n){
		ListNode p = head;
		ListNode q = head;
		for(int i = 0;i<n;i++){
			p = p.next;
		}
		if(p == null){
			head = head.next;
			return head;
		}
		while(p.next != null){
			p = p.next;
			q = q.next;
		}
		q.next = q.next.next;
		return head;
	}
}

