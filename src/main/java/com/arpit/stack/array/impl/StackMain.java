package com.arpit.stack.array.impl;

public class StackMain {

	public static void main(String[] args) throws Exception {
		FixedSizeArrayStack stack = new FixedSizeArrayStack();
		
		stack.push(7);
		stack.push(9);
		stack.push(11);
		stack.push(14);
		System.out.println(stack);
		
		stack.pop();
		System.out.println("After pop");
		System.out.println(stack);

	}

}
