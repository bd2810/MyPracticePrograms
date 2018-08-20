/*
 * Merge two sorted Linked Lists.
 * Usually with Linked Lists problems we only solve the problems with List nodes and 
 * return head node of the final list unless explicitly specified to return or display
 * the entire Linked List.
 * Just to see the output we will also print the entire LinkedList
 */

package LinkedList;

public class MergeTwoSortedLinkedLists {

	public static void main(String[] args) {

		ListNode head = new ListNode(10);
		ListNode second = new ListNode(5);
		ListNode third = new ListNode(7);
		ListNode fourth = new ListNode(3);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		
		LinkedList list = new LinkedList();
		list.display(head);
		
	}
	
	// First create a class ListNode which we can instantiate in our program 
	//with data and next node
	static class ListNode {
		
		public int data;
		public ListNode next;
		
		public ListNode(int nodedata) {
			
			this.data = nodedata;
			this.next = null;
		}		
	}
	
	// Second - Create a class LinkedList which we can instantiate with head and tail nodes
	static class LinkedList {
		
		public ListNode head;
		public ListNode tail;
		
		public LinkedList() {
			
			this.head = null;
			this.tail = null;			
		}	
		
		// Third - Create a method to insert data into nodes
		public void insertNode(int nodeData) {
			
			ListNode node = new ListNode(nodeData);
			
			if (this.head == null) {
				
				this.head = node;
				
			} else {
				
				
			}
		}
		
		public void display(ListNode head) {
			
			if (head == null) {
				return;
			}
			
			ListNode current = head;
			
			while(current != null) {
				System.out.print(current.data + " --> ");
				current = current.next;
			}
			
			System.out.print(current);
		}
		
	}
	

	
	public static ListNode mergeTwoLinkedList(ListNode l1, ListNode l2) {
		
		ListNode head = new ListNode(0);
		ListNode p = head;
		
		while (l1!=null || l2!=null) {
			
			if ((l1!=null) && (l2!=null)) {
				
				if (l1.data < l2.data) {
					
					p.next = l1;
					l1 = l1.next;
					
				} else {
					
					p.next = l2;
					l2 = l2.next;
				}
			} else if (l1!=null) {
				
				p.next = l1;
				break;				
				
			} else if (l2!=null) {
				
				p.next = l2;
				break;
			}
		}
				
		return p;
		
	}
	

	

	
	
	

}
