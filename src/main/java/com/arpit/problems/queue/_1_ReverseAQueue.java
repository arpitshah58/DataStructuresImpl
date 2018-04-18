/* In order to reverse a queue it will be pushed in to a stack
 * after that the stack will be pushed to the queue back
 * complexity = (n * 2) = 2n = O(n)
 * */
package com.arpit.problems.queue;

import com.arpit.queue.queuelinkedlist.LinkedListQueue;
import com.arpit.stack.linklist.impl.LinkedStack;

public class _1_ReverseAQueue {

	public static void main(String[] args) throws Exception {
		LinkedListQueue queue = new LinkedListQueue();
		queue.enqueue(6);
		queue.enqueue(9);
		queue.enqueue(11);
		queue.enqueue(16);

		System.out.println("------------- Queue is ------------");
		System.out.println(queue);

		LinkedStack stack = new LinkedStack();

		while (queue.size() > 0) {
			stack.push(queue.dequeue());
		}

		while (stack.size() > 0) {
			queue.enqueue(stack.pop());
		}

		System.out.println("------------ After reversing queue is --------------");
		System.out.println(queue);

	}

}
