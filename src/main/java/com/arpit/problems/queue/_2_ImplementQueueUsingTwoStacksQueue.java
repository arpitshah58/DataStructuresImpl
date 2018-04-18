package com.arpit.problems.queue;

import com.arpit.stack.linklist.impl.LinkedStack;

public class _2_ImplementQueueUsingTwoStacksQueue {
	
	LinkedStack stack1;
	LinkedStack stack2;
	
	public _2_ImplementQueueUsingTwoStacksQueue(){
		stack1 = new LinkedStack();
		stack2 = new LinkedStack();
	}
	
	public void enqueue(int number){
		stack1.push(number);
	}
	
	public int dequeue() throws Exception{
		if(stack1.isEmpty() && stack2.isEmpty()){
			throw new Exception("Queue is empty");
		}
		if(stack2.size() > 0){
			return stack2.pop();
		}
		while(stack1.size() > 0){
			stack2.push(stack1.pop());
		}
		return stack2.pop();
	}

	public static void main(String[] args) throws Exception {
		_2_ImplementQueueUsingTwoStacksQueue queue = new _2_ImplementQueueUsingTwoStacksQueue();

		//
		System.out.println(queue.dequeue());
		queue.enqueue(5);
		queue.enqueue(7);
		queue.enqueue(9);
		queue.enqueue(11);
		//System.out.println(queue);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		//System.out.println(queue);
		queue.enqueue(15);
		queue.enqueue(17);
		//System.out.println(queue);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		//System.out.println(queue);
	}

}
