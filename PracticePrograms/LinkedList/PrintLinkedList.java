/*
 * Given a List node, print all elements it holds
 */

package LinkedList;

public class PrintLinkedList {

	public static void main(String[] args) {

		/*
		 * Create a Single Linked List as below with 10 as head node
		 * 10 --> 5 --> 7 --> 3 --> null
		 */		
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(5);
		ListNode third = new ListNode(7);
		ListNode fourth = new ListNode(3);
		
		//Attach them together to form the list
		head.next = second;
		second.next = third;
		third.next = fourth;
		
		LinkedList list = new LinkedList();
		list.display(head);
		
	}
	
	// First - Create a class LinkedList which we can instantiate with head nodes
	private static class LinkedList {
		
		private ListNode head;
		
		public LinkedList() {
			
			this.head = null;
		}	
		
		// Display method to display all the elements it holds using head node
		public void display(ListNode head) {
			
			if (head == null) {
				return;
			}
			
			ListNode current = head;
			
			// Loop each element till the end of the list. last node points to null
			while(current != null) {
				System.out.print(current.data + " --> ");	// prints current node's data
				current = current.next;
			}
			
			System.out.print(current);	// Here current will be null
		}
		
	}
	
	
	// Second create a class ListNode which we can instantiate in our program 
	//with data and next node
	private static class ListNode {
		
		private int data;
		private ListNode next;
		
		public ListNode(int nodedata) {
			
			this.data = nodedata;
			this.next = null;
		}		
	}

}
