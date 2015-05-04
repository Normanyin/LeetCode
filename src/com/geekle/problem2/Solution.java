package com.geekle.problem2;


public class Solution {
	
	public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode current = result;
		long int1 = 0,int2 = 0;
		int i = 0;
		while (l1 != null) {
			int1 += l1.val* Math.pow(10, i++);
			l1 = l1.next;
		}
		i = 0;
		while (l2 != null) {
			int2 += l2.val * Math.pow(10, i++);
			l2 = l2.next;
		}
		long sum = int1 + int2;
		current.val = (int) (sum % 10);
		sum = sum/10;
		while (sum != 0) {
			current.next = new ListNode((int) (sum % 10));
			sum = sum/10;
			current = current.next;
		}
		return result;
	}
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int flag;
		ListNode result = new ListNode(0);
		ListNode temp = result;
		if (l1.val + l2.val >= 10) {
			flag = 1;
			temp.val = (l1.val + l2.val)%10;
		} else {
			flag = 0;
			temp.val = l1.val + l2.val;
		}
		while (l1.next != null || l2.next != null || l1.val + l2.val +flag >= 10) {
			temp.next = new ListNode(flag);
			temp = temp.next;
			if (l1.next == null) {
				l1.next = new ListNode(0);
			}
			if (l2.next == null) {
				l2.next = new ListNode(0);
			}
			l1 = l1.next;
			l2 = l2.next;
			if (l1.val + l2.val + flag >=10) {
				flag = 1;
				temp.val = (l1.val + l2.val)%10 + temp.val;
			} else {
				flag = 0;
				temp.val = l1.val + l2.val + temp.val;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] input1 = {9};
		int[] input2 = {1,9,9,9,9,9,9,9,9,9};
		ListNode l1 = new ListNode(input1[0]);
		ListNode l2	= new ListNode(input2[0]);
		for (int i = 1; i <= input1.length-1; i++) {
			l1.addNode(input1[i]);
		}
		for (int i = 1; i <= input2.length-1; i++) {
			l2.addNode(input2[i]);
		}
		
		l1.displayList();
		l2.displayList();
		addTwoNumbers1(l1, l2).displayList();;
	}
}
