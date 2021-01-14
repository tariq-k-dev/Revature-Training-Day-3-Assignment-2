package com.revature.day03.assignment2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeManager {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101L, "Bob", "Harris", "Java Developer");
		Employee emp2 = new Employee(175L, "Tom", "Jones", "Marketing");
		Employee emp3 = new Employee(339L, "Tariq", "Khan", "Pega Developer");
		Employee emp4 = new Employee(451L, "Tim", "Smith", "Tech Support");
		
		serializeEmployee(emp1);
		deserializeEmployee(emp1);
		serializeEmployee(emp2);
		deserializeEmployee(emp2);
		serializeEmployee(emp3);
		deserializeEmployee(emp3);
		serializeEmployee(emp4);
		deserializeEmployee(emp4);
	}
	
	public static void serializeEmployee(Employee emp) {
		try {
			FileOutputStream fos = new FileOutputStream("employees.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);		
			oos.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void deserializeEmployee(Employee emp) {
		try {
			FileInputStream fis = new FileInputStream("employees.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee empObj = (Employee) ois.readObject();
			
			System.out.println(empObj.toString());
			
			ois.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
