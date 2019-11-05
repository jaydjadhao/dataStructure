package com.ds.lists;

import java.util.ArrayList;
import java.util.List;

import com.ds.lists.vo.Employee;
public class ListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		
		// add item at last
		employees.add(new Employee("ankush", "Jadhao", 132));
		employees.add(new Employee("John", "Tendulkar", 133));
		employees.add(new Employee("amir", "kohli", 134));
		employees.add(new Employee("Salman", "Sharma", 135));
		
		employees.forEach(employee -> System.out.println(employee));
		
		// Shift the elements and add item at index
		employees.add(3, new Employee("Akshay", "Dhawan", 136));
		
		System.out.println(" New List ...");
		
		employees.forEach(employee -> System.out.println(employee));
		
		// get the item at index
		System.out.println(employees.get(1));
		
		// set to replace the item , it returns the replaced item
		System.out.println(employees.set(1,new Employee("Rajkumar", "Pandya", 137)));
		
		// contains method will return False if equals method is not implemented in Employee class
		System.out.println(employees.contains(new Employee("Rajkumar", "Pandya", 137)));

		
		

		

	}

}
