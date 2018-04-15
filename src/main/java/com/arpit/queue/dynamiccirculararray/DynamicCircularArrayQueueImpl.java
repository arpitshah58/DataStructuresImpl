package com.arpit.queue.dynamiccirculararray;

public class DynamicCircularArrayQueueImpl {

	public static void main(String[] args) throws Exception {
		DynamicCircularArrayQueue queue = new DynamicCircularArrayQueue(2);
		
		queue.enqueue(5);
		queue.enqueue(7);
		queue.enqueue(9);
		queue.enqueue(11);
		
		System.out.println(queue);
		
		System.out.println(queue.dequeue());
		
		System.out.println(queue.dequeue());
		
		System.out.println(queue);
		
		queue.enqueue(15);
		
		queue.enqueue(17);
		
		System.out.println(queue);

	}

}
