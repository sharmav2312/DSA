package com.vishu.dsa.linkedlist;

public class InsertAtTheEndOfLinkedList {
	
	private static Node head;
	
	private static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = next;
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
	// method to insert at the end of the list
	public static void insertEnd(int value) {
		Node node = new Node(value);
		if(head == null) {
			head = node;
		}
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = node;
	}
	
	public static void main(String[] args) {
		head = new Node(10);
		Node second = new Node(20);
		head.next = second;
		printList();
		insertEnd(30);
		insertEnd(60);
		insertEnd(50);
		printList();
	}

}
