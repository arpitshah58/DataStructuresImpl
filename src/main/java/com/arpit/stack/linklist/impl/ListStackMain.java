package com.arpit.stack.linklist.impl;

public class ListStackMain {

	public static void main(String[] args) throws Exception {
		LinkedStack stack = new LinkedStack();
		stack.push(6);
		stack.push(8);
		stack.push(9);
		stack.push(12);
		stack.push(15);
		
		System.out.println(stack);
		
		stack.pop();
		System.out.println("After popping");
		System.out.println(stack);
		
		stack.peek();
		System.out.println("After peeping");
		System.out.println(stack);

	}

}
