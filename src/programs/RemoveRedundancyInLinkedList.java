package programs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RemoveRedundancyInLinkedList {

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

	/*
	 * 
	 * For your reference:
	 *
	 * 
	 * 
	 * SinglyLinkedListNode {
	 * 
	 * int data;
	 * 
	 * SinglyLinkedListNode next;
	 * 
	 * }
	 *
	 * 
	 * 
	 */

	static SinglyLinkedListNode distinct(SinglyLinkedListNode head) {

		SinglyLinkedListNode ptr2 = null;
		SinglyLinkedListNode dup = null;
		SinglyLinkedListNode ptr1 = head;

		while (ptr1 != null && ptr1.next != null) {
			ptr2 = ptr1;

			/*
			 * Compare the picked element with rest of the elements
			 */
			while (ptr2.next != null) {

				/* If duplicate then delete it */
				if (ptr1.data == ptr2.next.data) {

					/* sequence of steps is important here */
					dup = ptr2.next;
					ptr2.next = ptr2.next.next;
					System.gc();
				} else /* This is tricky */ {
					ptr2 = ptr2.next;
				}
			}
			ptr1 = ptr1.next;
		}

		return ptr1;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		SinglyLinkedList head = new SinglyLinkedList();

		int headCount = scanner.nextInt();

		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < headCount; i++) {

			int headItem = scanner.nextInt();

			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			head.insertNode(headItem);

		}

		SinglyLinkedListNode res = distinct(head.head);

		printSinglyLinkedList(res, "\n", bufferedWriter);

		bufferedWriter.newLine();

		bufferedWriter.close();

		// System.out.println(res);

		scanner.close();

	}

}
