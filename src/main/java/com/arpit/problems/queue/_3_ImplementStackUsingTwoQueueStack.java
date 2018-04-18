package com.arpit.problems.queue;

import com.arpit.queue.queuelinkedlist.LinkedListQueue;

public class _3_ImplementStackUsingTwoQueueStack {
	
	LinkedListQueue q1;
	LinkedListQueue q2;
	
	public _3_ImplementStackUsingTwoQueueStack(){
		q1 = new LinkedListQueue();
		q2 = new LinkedListQueue();
	}
	
	public void push(int number){
		q1.enqueue(number);
	}
	
	public int pop() throws Exception{
		if(q1.isEmpty()){
			throw new Exception("stack is Empty");
		}
		while(q1.size() > 1){
			q2.enqueue(q1.dequeue());
		}
		swap();
		return q2.dequeue();
	}
	
	private void swap(){
		LinkedListQueue temp;
		temp = q1;
		q1 = q2;
		q2 = temp;
	}

	public static void main(String[] args) throws Exception {
		_3_ImplementStackUsingTwoQueueStack stack = new _3_ImplementStackUsingTwoQueueStack();
		
		//System.out.println(stack.pop());
		stack.push(5);
		stack.push(7);
		stack.push(9);
		stack.push(11);
		//System.out.println(queue);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//System.out.println(queue);
		stack.push(15);
		stack.push(17);
		//System.out.println(queue);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//System.out.println(queue);
		

	}

}
