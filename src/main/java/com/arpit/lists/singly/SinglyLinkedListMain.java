package com.arpit.lists.singly;

public class SinglyLinkedListMain {

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.insertAtBegin(5);
		list1.insertAtBegin(8);
		list1.insertAtBegin(26);
		list1.insertAtBegin(32);
		list1.insert(17, 2);
		System.out.println(list1);
		list1.removeFromBegin();
		list1.removeFromEnd();
		list1.removeMatched(17);
		list1.remove(2);
		System.out.println("After removing first and last and 17");
		System.out.println(list1);
		
		LinkedList list2 = new LinkedList();
		list2.removeFromBegin();
		list2.removeFromEnd();
		list2.remove(6);
		list2.insert(7, 7);
		list2.insert(56, 6);
		System.out.println(list2);
		list2.clearAll();
		System.out.println("After clearing list");
		System.out.println(list2);

	}

}
