package com.vishu.dsa.linkedlist;

public class InsertAtSpecificPosition {
	
	private static Node head;
	
	private static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	// method to print linked list
	public static void printList() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println("null");
	}
	// method to inert a value at a specific position
	public static void insertAtPos(int value, int pos) {
		Node node = new Node(value);
		if(pos == 1) {
			node.next = head;
			head = node;
		}
		else {
			Node previous = head;
			int count = 1;
			while(count < pos-1) {
				previous = previous.next;
				count++;
			}
			Node current = previous.next;
			node.next = current;
			previous.next = node;
		}
	}
	
	public static void main(String[] args) {
		head = new Node(10);
		Node second = new Node(20);
		head.next = second;
		Node third = new Node(30);
		second.next = third;
		
		printList();
		insertAtPos(70,2);
		printList();
	}

}
