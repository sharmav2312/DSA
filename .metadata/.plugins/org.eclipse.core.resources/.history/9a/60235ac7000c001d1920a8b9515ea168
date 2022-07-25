package com.vishu.dsa.linkedlist;

public class DeleteFirst {
	
	private static Node head;
	
	private static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	// method to print the list
	public static void printList() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println("null");
	}
	
	// method to delete the first node of the list
	public static Node deleteFirst() {
		if(head == null) {
			return null;
		}
		Node temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}
	
	public static void main(String[] args) {
		head = new Node(10);
		Node second = new Node(20);
		Node three = new Node(30);
		head.next = second;
		second.next = three;
		printList();
		deleteFirst();
		printList();
	}

}
