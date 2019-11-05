package com.ds.lists.linkedlists.doubly;

import com.ds.lists.vo.Employee;

public class EmplyeeDoublyLinkedList {

	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;

	/**
	 * @return the head
	 */
	public EmployeeNode getHead() {
		return head;
	}

	/**
	 * @return the head
	 */
	public EmployeeNode getTail() {
		return tail;
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
		if (head == null) {
			tail = employeeNode;
		} else {
			head.setPrevious(employeeNode);
		}
		head = employeeNode;
		size++;
	}

	public EmployeeNode removeFromFront() {
		if (isEmpty())
			return null;
		EmployeeNode removedNode = head;
		head = head.getNext();
		size--;
		if (head == null) {
			tail = null;
		} else {
			head.setPrevious(null);
		}

		removedNode.setPrevious(null);
		removedNode.setNext(null);
		return removedNode;
	}

	public void addToBack(Employee employee) {

		EmployeeNode employeeNode = new EmployeeNode(employee);
		if(tail != null) {
			tail.setNext(employeeNode);
		}
		employeeNode.setPrevious(tail);
		if (head == null) {
			head = employeeNode;
		} 
		tail = employeeNode;
		size++;
	}

	public EmployeeNode removeFromBack() {
		if (isEmpty())
			return null;
		EmployeeNode removedNode = tail;
		tail = tail.getPrevious();
		size--;
		if (tail == null) {
			head = null;
		}else {
			tail.setNext(null);
		}

		removedNode.setPrevious(null);
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
		while (currentNode != null) {
			System.out.print(currentNode);
			System.out.print("<=>");
			// move to the next mode
			currentNode = currentNode.getNext();
		}
		System.out.println("null");
	}

}
