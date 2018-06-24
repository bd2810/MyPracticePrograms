package LinkedList;

/*
 * Interview question asked for Visa via HackerRank
 * Input size of integer array, than input the integers.
 * Complete the 'distinct' function below to return a non redundant linked list 
 * removing all duplicate integers. 
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class LinkedListRemoveDuplicates {

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

	public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter)
			throws IOException {

		while (node != null) {

			bufferedWriter.write(String.valueOf(node.data));

			node = node.next;

			if (node != null) {

				bufferedWriter.write(sep);

			}

		}

	}

	// Complete the distinct function below.

	static SinglyLinkedListNode distinct(SinglyLinkedListNode head) {

		SinglyLinkedListNode node1 = head;
		SinglyLinkedListNode node2 = null;		

		while (node1 != null && node1.next != null) {
			
			node2 = node1;

			/*
			 * Compare the picked element with rest of the elements
			 */
			while (node2.next != null) {

				/* If duplicate then delete it */
				if (node1.data == node2.next.data) {

					node2.next = node2.next.next;
					
				} else {
					node2 = node2.next;
				}
			}
			node1 = node1.next;
		}

		return head;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		SinglyLinkedList head = new SinglyLinkedList();

		int headCount = scanner.nextInt();

		for (int i = 0; i < headCount; i++) {

			int headItem = scanner.nextInt();

			head.insertNode(headItem);

		}

		SinglyLinkedListNode res = distinct(head.head);

		printSinglyLinkedList(res, "\n", bufferedWriter);

		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();

	}

}
