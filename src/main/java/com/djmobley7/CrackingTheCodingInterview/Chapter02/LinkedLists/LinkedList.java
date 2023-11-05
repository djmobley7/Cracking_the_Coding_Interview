package com.djmobley7.CrackingTheCodingInterview.Chapter02.LinkedLists;

public class LinkedList<T> {
	protected Node head;
	
	protected class Node {
		T value;
		Node next;
		
		public Node(T value) {
			this.value = value;
		}
		
		@Override
		public String toString() {
			return value.toString();
		}
	}
	
	public void addIteratively(T value) {
		if (head == null) {
			head = new Node(value);
			return;
		}
		
		// iterate to end of list
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		
		current.next = new Node(value);
	}
	
	public void addRecursively(T value) {
		if (head == null) {
			head = new Node(value);
			return;
		}
		
		add(head, value);
	}
	
	protected void add(Node current, T value) {
		if (current.next == null) {
			current.next = new Node(value);
			return;
		}
		
		add(current.next, value);
	}
	
	public void print() {
		System.out.print("List: ");
		for(Node current = head; current != null; current = current.next) {
			System.out.print(current + " ");
		}
		System.out.println();
	}
}
