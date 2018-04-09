package com.arpit.stack.array.impl;

public class FixedSizeArrayStack {
	
	protected int capacity;
	
	public static final int CAPACITY = 10;
	
	protected int[] stackRep;
	
	protected int top = -1;
	
	public FixedSizeArrayStack(){
		this(CAPACITY);
	}

	public FixedSizeArrayStack(int capacity) {
		this.capacity = capacity;
		stackRep = new int[capacity];
	}
	
	//Returns the number of elements in the stack
	public int size(){
		return (top + 1);
	}
	
	//Tests weather Stack is empty
	public boolean isEmpty(){
		return (top < 0);
	}
	
	//inserts an element at top of the stack
	public void push(int number) throws Exception{
		if(size() == capacity){
			throw new Exception("stack is full");
		}
		stackRep[++top] = number; 
	}
	
	//inspects an element at top of the stack
	public int top() throws Exception {
		if(isEmpty()){
			throw new Exception("stack is empty");
		}
		return stackRep[top];
	}
	
	// Removes the element from the stack
	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int temp = stackRep[top];
		stackRep[top--] = Integer.MIN_VALUE;
		return temp;
	}
	
	
	//returns String representation
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("{");
		for(int i = 0;i<size();i++){
			if(i != 0){
				builder.append(",");
			}
			builder.append(stackRep[i]);
		}
		builder.append("}");
		return builder.toString();
	}
	
	
}
