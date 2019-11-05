package com.ds.lists.linkedlists.singly;

import com.ds.lists.vo.Employee;

public class EmployeeNode {
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeNode [employee=" + employee + "]";
	}
	
	
}
