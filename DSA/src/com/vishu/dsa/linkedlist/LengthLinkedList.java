package com.vishu.dsa.linkedlist;

public class LengthLinkedList {
	
	private static Node head;
	
	private static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static void printLinkedList() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public static int lengthOfList() {
		int count = 0;
		Node current = head;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	public static void main(String[] args) {
		head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		head.next = second;
		second.next = third;
		third.next = fourth;
		printLinkedList();
		System.out.println("Length of list is: "+ lengthOfList());
	}

}
