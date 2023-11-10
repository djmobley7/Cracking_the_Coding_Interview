package com.djmobley7.CrackingTheCodingInterview.Chapter03.StacksAndQueues;

public class Stack<T> {
	private class Node<T> {
		T value;
		Node<T> next;
		
		public Node(T value, Node<T> next) {
			this.value = value;
			this.next = next;
		}
	}
	
	private Node<T> top = null;
	
	public T pop() {
		T value = null;
		
		if (top != null) {
			value = top.value;
			top = top.next;
		}
		
		return value;
	}
	
	public void push (T value) {
		Node<T> node = new Node<>(value, top);
		top = node;
	}
	
	public T peek() {
		T value = null;
		
		if (top != null) {
			value = top.value;
		}
		
		return value;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	@Override
	public String toString() {	
		StringBuilder sb = new StringBuilder();
		
		Node<T> current = top;
		for(; current != null; current = current.next) {
			if (sb.length() > 0) {
				sb.append(", ");
			}
//			sb.append('{');
			sb.append(current.value);
//			sb.append('}');
		}
		
		return sb.toString();
	}
}
