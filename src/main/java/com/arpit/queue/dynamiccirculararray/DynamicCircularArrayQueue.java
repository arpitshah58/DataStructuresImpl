package com.arpit.queue.dynamiccirculararray;

public class DynamicCircularArrayQueue {

	private int[] queueRep;
	private int front, rear;
	private int size;
	private static int CAPACITY = 16;
	private int capacity;

	public DynamicCircularArrayQueue() {
		this(CAPACITY);
	}

	public DynamicCircularArrayQueue(int capacity) {
		this.capacity = capacity;
		queueRep = new int[capacity];
		front = 0;
		rear = 0;
		size = 0;
	}

	public void enqueue(int num) {
		if (size == capacity) {
			expand();
		}
		size++;
		queueRep[rear] = num;
		rear = (rear + 1) % capacity;
	}

	private void expand() {
		capacity = capacity << 1;
		int[] newArray = new int[capacity];

		for (int i = front; i < size; i++) {
			newArray[i - front] = queueRep[i % capacity];
		}

		queueRep = newArray;
		front = 0;
		rear = size;
	}

	public int size() {
		return size;
	}

	private boolean isEmpty() {
		return size == 0;
	}

	public int dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is already Empty");
		}
		int value = queueRep[front % capacity];
		queueRep[front++] = 0;
		size--;
		return value;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("{");
		for (int i = 0; i < size; i++) {
			if (i != 0) {
				builder.append(",");
			}
			builder.append(queueRep[(front + i) % capacity]);
		}
		return builder.append("}").toString();
	}

}
