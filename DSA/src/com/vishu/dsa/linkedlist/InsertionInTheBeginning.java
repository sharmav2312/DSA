package com.vishu.dsa.linkedlist;

public class InsertionInTheBeginning {
	
	private static Node head;
	
	private static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static void insertBeg(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;
	}
	
	public static void printList() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		head = new Node(10);
		Node second = new Node(20);
		head.next = second;
		
		insertBeg(30);
		insertBeg(40);
		insertBeg(50);
		
		printList();
		
	}

}
