package com.geekle.problem002;

public class ListNode {
	int val;
	ListNode next;
	public ListNode(int x) {
		val = x;
		next = null;
	}
	
	public void addNode(int a) {
		ListNode newNode = new ListNode(a);
		ListNode p = this;
		while (p.next != null) {
			p = p.next;
		}
		p.next = newNode;
		newNode.next = null;
		
	}
	
	public void insertNode(int a) {
		if (this.next == null) {
			this.next = new ListNode(a);
		} else {
			ListNode newNode = new ListNode(a);
			newNode.next = this.next;
			this.next = newNode;
		}
	}
	
	public void displayList() {
		System.out.print("ListNode:");
		ListNode currentNode = this;
		System.out.print(currentNode.val);
		while (currentNode.next != null) {
			currentNode = currentNode.next;
			System.out.print("->" + currentNode.val);
		}
		System.out.println();
	}
}
