/**
 You are given two non-empty linked lists representing two non-negative integers. 
 The digits are stored in reverse order and each of their nodes contain a single digit. 
 Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */
package programs;

import java.util.Scanner;

public class AddTwoNumLinkedList {

	private static Scanner scanner;
	
	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		
		int firstNumLength = scanner.nextInt();
		
		SinglyLinkedList list1 = new SinglyLinkedList();
		
		for (int i=0; i<firstNumLength; i++) {
			
			list1.insertNode(scanner.nextInt());
		}
		
		int secondNumLength = scanner.nextInt();
		
		SinglyLinkedList list2 = new SinglyLinkedList();
		
		for (int i=0; i<secondNumLength; i++) {
			
			list2.insertNode(scanner.nextInt());
		}
	
		addTwoNumbers(list1.head, list2.head);
	}
	
	public static void addTwoNumbers(SinglyLinkedListNode n1, SinglyLinkedListNode n2) {
		
		SinglyLinkedList finalList = new SinglyLinkedList();
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		while (n1 != null) {
			
			sb1.append(String.valueOf(n1.data));
			n1 = n1.next;
		}

		while (n2 != null) {
			
			sb2.append(String.valueOf(n2.data));
			n2 = n2.next;
		}
		
		sb1 = sb1.reverse();
		sb2 = sb2.reverse();
		
		int num1 = Integer.parseInt(sb1.toString());
		int num2 = Integer.parseInt(sb2.toString());
		
		System.out.println("First reversed integer is: " + num1);
		System.out.println("Second reversed integer is: " + num2);
		
		int finalNum = num1 + num2;
		
		System.out.println("Sum of two numbers is: " + finalNum);
		
		int number = finalNum;
		int reverseNum = 0;
	    
		// The below while loop will reverse the integer i.e 123 will become 321
		while (finalNum > 0)
	    {
	    	reverseNum = reverseNum * 10 + finalNum % 10;
	        finalNum = finalNum / 10;
	    }	    
	    
	    System.out.println("Reversed final number is: " + reverseNum);
	    
	    // The below while loop will insert each separate digit from an integer to the list
	    while (number > 0) {
	    	finalList.insertNode(number % 10);
	    	number = number / 10;
	    	
	    }		
		
	    SinglyLinkedListNode node = finalList.head;
	    
	    while (node != null) {			
			 			
			System.out.print(node.data);
			node = node.next;
			
			if (node != null) {
				System.out.print(" -> ");
			}
		}    
	}
	
	static class SinglyLinkedListNode {

		public int data;

		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {

			this.data = nodeData;

			this.next = null;

		}

	}

	static class SinglyLinkedList {

		public SinglyLinkedListNode head;

		public SinglyLinkedListNode tail;

		public SinglyLinkedList() {

			this.head = null;

			this.tail = null;

		}

		public void insertNode(int nodeData) {

			SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

			if (this.head == null) {

				this.head = node;

			} else {

				this.tail.next = node;

			}

			this.tail = node;

		}

	}

}
