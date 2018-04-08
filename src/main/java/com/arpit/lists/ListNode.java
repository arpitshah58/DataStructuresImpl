package com.arpit.lists;

public class ListNode {

	private int data;
	private ListNode next;

	public ListNode() {
	}

	public ListNode(int data, ListNode next) {
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

	@Override
	public int hashCode() {
		return this.getData();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ListNode)) {
			return false;
		}
		ListNode node = (ListNode) obj;
		if (this.data == node.getData()) {
			return true;
		} else {
			return false;
		}
	}

}
