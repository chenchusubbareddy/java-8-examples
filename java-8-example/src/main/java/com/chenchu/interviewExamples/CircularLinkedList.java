package com.chenchu.interviewExamples;

public class CircularLinkedList {

	CircularLinkedList() {
		last = null;
		length = 0;
	}

	private ListNode head;
	private ListNode last;
	private int length;

	private class ListNode {
		private ListNode next;
		private int data;

		ListNode(int data) {
			this.data = data;
		}

	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public void createCircularLinkedList() {
		ListNode first = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;
		head = first;
		last = fourth;
	}

	public void displayCirularLinkedList() {
		ListNode current = head;
		while (current != null) {
            System.out.println(current.data);
            current=current.next;
		}
	}

	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();
		cll.createCircularLinkedList();
		cll.displayCirularLinkedList();

	}

}
