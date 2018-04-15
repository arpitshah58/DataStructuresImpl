package com.arpit.queue.circulararray;

public class FixedSizeCircularArrauQueue {

	public static final int CAPACITY = 16;
	int capacity;
	int front;
	int rear;
	int[] queurRep;
	int size;

	public FixedSizeCircularArrauQueue() {
		this(CAPACITY);
	}

	public FixedSizeCircularArrauQueue(int capacity) {
		this.capacity = capacity;
		rear = 0;
		front = 0;
		size = 0;
		queurRep = new int[capacity];
	}
	
	private void incrementSize(){
		size++;
	}
	
	private void decreamentSize(){
		size--;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public void enqueue(int number) throws Exception {
		if (size == capacity) {
			throw new Exception("queue is already full");
		}
		queurRep[rear] = number;
		incrementSize();
		rear = (rear + 1) % capacity;
	}

	public int dequeue() throws Exception {
		if (size == 0) {
			throw new Exception("queue is Empty");
		}
		int number = queurRep[front];
		queurRep[front] = 0;
		front = (front + 1) % capacity;
		decreamentSize();
		return number;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("{");
		int index = front;
		for(int i = 0;i<size;i++){
			if(index != front){
				builder.append(",");
			}
		builder.append(queurRep[index]);
		index = (index + 1) % capacity;
		}
		builder.append("}");
		return builder.toString();
	}
}
