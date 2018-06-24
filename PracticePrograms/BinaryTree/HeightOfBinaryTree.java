package BinaryTree;


/*
 * The height of a binary tree is the number of edges between the tree's root and its farthest leaf.
 * Calculate the 'height' function below to calculate the height of the binary tree.
 * Input Format:
 * The first line contains an integer , the number of nodes in the tree. 
 * Next line contains  space separated integer where th integer denotes node[i].data.
 * Note: In a binary search tree, all nodes on the left branch of a node are less than the node value. 
 * All values on the right branch are greater than the node value.
 */

import java.util.Scanner;

class Node {
	Node left;
	Node right;
	int data;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

public class HeightOfBinaryTree {
	/*
	 * class Node int data; Node left; Node right;
	 */
	public static int height(Node root) {

		if (root == null) {
			return -1;
		}

		int left = 1 + height(root.left);
		int right = 1 + height(root.right);

		return left > right ? left : right;

	}

	public static Node insert(Node root, int data) {
		if (root == null) {

			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		Node root = null;
		while (t-- > 0) {
			int data = scan.nextInt();
			root = insert(root, data);
		}
		scan.close();
		int height = height(root);
		System.out.println(height);
	}
}
