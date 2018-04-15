package com.arpit.queue.queuelinkedlist;

import com.arpit.lists.singly.ListNode;

public class LinkedListQueue {

	private ListNode front,rear;
	private int length;
	
	public LinkedListQueue(){
		
	}
	
	public void enqueue(int data){
		ListNode node = new ListNode(data);
		if(length == 0){
			front = node;
		}else{
			rear.setNext(node);
		}
		rear = node;
		length++;
	}
	
	public int dequeue() throws Exception{
		
		if(isEmpty()){
			throw new Exception("Queue is already Empty");
		}
		
		ListNode removedNodePrevious = front;
		ListNode removedNode = front;
		if(length == 1){
			removedNode = front;
			front = null;
			rear = null;
			length--;
			return removedNode.getData();
		}
		for(int i=0;i<length-1;i++){
			removedNodePrevious = removedNode;
			removedNode = removedNodePrevious.getNext();
		}
		removedNodePrevious.setNext(null);
		rear = removedNodePrevious;
		length--;
		return removedNode.getData();
	}
	
	public boolean isEmpty(){
		return length == 0;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder("{");
		ListNode currentNode = front;
		for (int i = 0; i < length; i++) {
			if (i != 0) {
				builder.append(",");
			}
			builder.append(currentNode.getData());
			currentNode = currentNode.getNext();
		}
		return builder.append("}").toString();
	}
}
