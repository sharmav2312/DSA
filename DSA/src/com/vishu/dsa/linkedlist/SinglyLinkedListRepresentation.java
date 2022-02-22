package com.vishu.dsa.linkedlist;

public class SinglyLinkedListRepresentation {
	
	private static Node head;
	
	private static class Node {
		private int data;
		private Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static void main(String[] args) {
		head = new Node(10);
		Node second = new Node(20);
		head.next = second;
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		
	}

}
