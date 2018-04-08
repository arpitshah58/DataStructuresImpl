package com.arpit.lists;

public class LinkedList {

	private ListNode head;
	private int length = 0;

	public LinkedList() {
		length = 0;
	}

	private void increaseLength() {
		length += 1;
	}

	private void decreaseLength() {
		length -= 1;
	}

	// Return the first Node in the List
	public synchronized ListNode getHead() {
		return head;
	}

	// Insert a node at the beginning of the list
	public synchronized void insertAtBegin(int number) {
		ListNode newNode = new ListNode(number, null);
		newNode.setNext(head);
		head = newNode;
		this.increaseLength();
	}

	// Insert a node at the end of the list
	public synchronized void insertAtEnd(int number) {
		ListNode newNode = new ListNode(number, null);
		ListNode currentNode = head;

		while (currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(newNode);
		this.increaseLength();
	}

	// Insert a node at the given position in the list
	public synchronized void insert(int number, int position) {

		ListNode newNode = new ListNode(number, null);

		// Fix the position
		if (position < 0) {
			position = 0;
		}
		if (position > length ) {
			position = length ;
		}

		if (head == null) {
			head = newNode;
			this.increaseLength();
		} else if (position == 0) {
			this.insertAtBegin(number);
		} else {
			ListNode currentNode = head;
			for (int i = 1; i <= position - 1; i++) {
				currentNode = currentNode.getNext();
			}
			newNode.setNext(currentNode.getNext());
			currentNode.setNext(newNode);
			this.increaseLength();
		}
	}

	// Remove and return of the node at the head of the list
	public ListNode removeFromBegin() {
		if (head == null) {
			return null;
		}
		ListNode deleteNode = head;
		head = head.getNext();
		deleteNode.setNext(null);
		this.decreaseLength();
		return deleteNode;
	}

	// Remove and return of the node at the end of the list
	public ListNode removeFromEnd() {
		if (head == null) {
			return null;
		}

		ListNode previousNode = head;
		ListNode deleteNode = head.getNext();

		if (deleteNode == null) {
			head = null;
			return previousNode;
		}
		while (deleteNode.getNext() != null) {
			previousNode = previousNode.getNext();
			deleteNode = deleteNode.getNext();
		}
		previousNode.setNext(null);
		this.decreaseLength();
		return deleteNode;
	}

	// Remove node matching from specified node in the list
	public void removeMatched(int number) {
		ListNode node = new ListNode(number, null);
		if (head == null) {
			return;
		}
		if (node.equals(head)) {
			head = head.getNext();
			this.decreaseLength();
			return;
		}

		ListNode p = head, q = null;

		while ((q = p.getNext()) != null) {
			if (node.equals(q)) {
				p.setNext(q.getNext());
				q.setNext(null);
				this.decreaseLength();
				return;
			}
			p = q;
		}

	}

	// Remove the node at the given position
	public void remove(int position) {

		if (head == null) {
			return;
		}
		if (position <= 0) {
			removeFromBegin();
		}
		if (position > length - 1) {
			position = length - 1;
		}
		ListNode deleteNode = head;

		for (int i = 1; i < position; i++) {
			deleteNode = deleteNode.getNext();
		}
		deleteNode.setNext(deleteNode.getNext().getNext());
		decreaseLength();
	}
	
	//remove Everything from the list
	public void clearAll(){
		head = null;
		length = 0;
	}

	// print toString
	@Override
	public String toString() {
		StringBuilder returnString = new StringBuilder("{");
		ListNode currentnode = head;

		while (currentnode != null) {
			if (head != currentnode) {
				returnString.append(",");
			}
			returnString.append(currentnode.getData());
			currentnode = currentnode.getNext();
		}

		return returnString + "}" + " :: length = " + this.length;
	}

}
