package com.ds.lists.linkedlists.doubly;

import com.ds.lists.vo.Employee;

public class Main {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Ankush", "Jadhao", 123);
		Employee emp2 = new Employee("sachin", "khan", 123);
		Employee emp3 = new Employee("Virat", "Kumar", 123);
		Employee emp4 = new Employee("Mahi", "Kapur", 123);
		
		EmplyeeDoublyLinkedList linkedList = new EmplyeeDoublyLinkedList();
		
		System.out.println(linkedList.isEmpty());
		
		linkedList.addToFront(emp1);
		linkedList.addToFront(emp2);
		linkedList.addToFront(emp3);
		linkedList.addToFront(emp4);
		
		System.out.println(linkedList.getSize());
		linkedList.printLinkList();
		
		System.out.println("\n Head Node : " + linkedList.getHead());
		System.out.println("Tail Node : " + linkedList.getTail());
		
		System.out.println("\nRemoved Node : " + linkedList.removeFromFront());
		System.out.println(linkedList.getSize());
		linkedList.printLinkList();
		
		System.out.println("\n Head Node : " + linkedList.getHead());
		System.out.println("Tail Node : " + linkedList.getTail());
		
		System.out.println("\nRemoved Node : " + linkedList.removeFromFront());
		System.out.println("\nRemoved Node : " + linkedList.removeFromFront());
		//System.out.println("\nRemoved Node : " + linkedList.removeFromFront());
		//System.out.println("\nRemoved Node : " + linkedList.removeFromFront());

		
		System.out.println(linkedList.getSize());
		linkedList.printLinkList();
		
		System.out.println("\n Head Node : " + linkedList.getHead());
		System.out.println("Tail Node : " + linkedList.getTail());
		
		
		System.out.println("tail Operation Started .... ");
		Employee emp5 = new Employee("Jay", "shan", 1627);
		Employee emp6 = new Employee("Vijay", "Man", 776);

		linkedList.addToBack(emp5);
		linkedList.printLinkList();

		linkedList.addToBack(emp6);
		linkedList.printLinkList();
		System.out.println("\nRemoved Node : " + linkedList.removeFromBack());
		System.out.println("\nRemoved Node : " + linkedList.removeFromBack());
		
		System.out.println(linkedList.getSize());
		linkedList.printLinkList();
		
		System.out.println("\n Head Node : " + linkedList.getHead());
		System.out.println("Tail Node : " + linkedList.getTail());
		


		
	}

}
