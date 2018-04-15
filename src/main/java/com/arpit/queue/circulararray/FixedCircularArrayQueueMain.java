package com.arpit.queue.circulararray;

public class FixedCircularArrayQueueMain {

	public static void main(String[] args) throws Exception {
		FixedSizeCircularArrauQueue queue = new FixedSizeCircularArrauQueue();
		
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);
		System.out.println("After enqueing queue is ");
		System.out.println(queue);
		
		queue.dequeue();
		queue.dequeue();
		System.out.println("After dequeing queue is ");
		System.out.println(queue);
		
		
	}

}
