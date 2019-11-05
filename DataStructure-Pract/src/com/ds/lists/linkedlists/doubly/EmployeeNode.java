package com.ds.lists.linkedlists.doubly;

import com.ds.lists.vo.Employee;

public class EmployeeNode {
	private EmployeeNode previous;
	private Employee employee;
	private EmployeeNode next;
	/**
	 * @param employee
	 */
	public EmployeeNode(Employee employee) {
		super();
		this.employee = employee;
	}
	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}
	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	/**
	 * @return the next
	 */
	public EmployeeNode getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(EmployeeNode next) {
		this.next = next;
	}
	
	public EmployeeNode getPrevious() {
		return previous;
	}
	public void setPrevious(EmployeeNode previous) {
		this.previous = previous;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return employee.toString();
	}

	
}
