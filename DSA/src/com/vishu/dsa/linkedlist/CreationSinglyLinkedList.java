package com.vishu.dsa.linkedlist;

public class CreationSinglyLinkedList {
	
	private static Node head;
	
	private static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static void displayList() {
		Node current = head;
		while(current !=  null) {
			System.out.print(current.data+"->");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		head = new Node(10); // head --> 10 ---> null
		Node second = new Node(20); // second --> 20 ---> null
		Node third = new Node(30); // third --> 30 --->null
		Node fourth = new Node(40); // fourth --> 40 --> null
		head.next = second; // head(10) --> second(20) --> null
		second.next = third;// head(10) --> second(20) --> third(30) --> null
		third.next = fourth;// head(10) --> second(20) --> third(30) --> fourth(40) --> null
		displayList();
	}

}
