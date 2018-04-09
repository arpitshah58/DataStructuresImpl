package com.arpit.stack.linklist.impl;

import com.arpit.lists.singly.ListNode;

public class LinkedStack {
	
	private int length;
	
	private ListNode top;
	
	public LinkedStack(){
		length = 0;
		top = null;
	}
	
	public int size(){
		return length;
	}
	
	public void push(int number){
		ListNode newNode = new ListNode(number,null);
		newNode.setNext(top);
		top = newNode;
		length++;
	}
	
	public int pop() throws Exception {
		if(length == 0){
			throw new Exception("Stack is empty");
		}
		int result = top.getData();
		top = top.getNext();
		length--;
		return result;
	}
	
	public int peek()  throws Exception {
		if(isEmpty()){
			throw new Exception("Stack is empty");
		}
		return top.getData();
	}
	
	public boolean isEmpty(){
		return (top == null);
	}
	
	@Override
	public String toString(){
		ListNode currentNode = top;
		StringBuilder builder = new StringBuilder("{");
		for(int i = 0;i<size();i++){
			if(i != 0){
				builder.append(",");
			}
			builder.append(currentNode.getData());
			currentNode = currentNode.getNext();
		}
		builder.append("}");
		return builder.toString();
		
	}

}
