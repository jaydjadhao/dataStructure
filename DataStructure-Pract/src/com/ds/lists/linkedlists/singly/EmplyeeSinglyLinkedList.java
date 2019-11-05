package com.ds.lists.linkedlists.singly;

import com.ds.lists.vo.Employee;

public class EmplyeeSinglyLinkedList {

	private EmployeeNode head;
	private int size;
	/**
	 * @return the head
	 */
	public EmployeeNode getHead() {
		return head;
	}
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	
	public void addToFront(Employee employee) {
		
		EmployeeNode employeeNode = new EmployeeNode(employee);
		employeeNode.setNext(head);
		head = employeeNode;
		size++;
	}
	
	public EmployeeNode removeFromFront() {
		EmployeeNode removedNode = head;
		head = head.getNext();
		size --;
		removedNode.setNext(null);
		return removedNode;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void printLinkList() {
		if (isEmpty()) {
			return;
		}
		EmployeeNode currentNode = head;
		
		System.out.print("Head ->");
		while(currentNode != null) {
			System.out.print(currentNode);
			System.out.print("->");
			// move to the next mode
			currentNode = currentNode.getNext();
		}
		System.out.print("null");
	}
	
}
