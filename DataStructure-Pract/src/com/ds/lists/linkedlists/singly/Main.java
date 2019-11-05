package com.ds.lists.linkedlists.singly;

import com.ds.lists.vo.Employee;

public class Main {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Ankush", "Jadhao", 123);
		Employee emp2 = new Employee("sachin", "khan", 123);
		Employee emp3 = new Employee("Virat", "Kumar", 123);
		Employee emp4 = new Employee("Mahi", "Kapur", 123);
		
		EmplyeeSinglyLinkedList linkedList = new EmplyeeSinglyLinkedList();
		
		System.out.println(linkedList.isEmpty());
		
		linkedList.addToFront(emp1);
		linkedList.addToFront(emp2);
		linkedList.addToFront(emp3);
		linkedList.addToFront(emp4);
		
		System.out.println(linkedList.getSize());
		linkedList.printLinkList();
		
		System.out.println("\nRemoved Node : " + linkedList.removeFromFront());
		System.out.println(linkedList.getSize());
		linkedList.printLinkList();

		
	}

}
