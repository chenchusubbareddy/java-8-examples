package com.chenchu.java8example.streams;

import java.util.ArrayList;
import java.util.List;

public class MyStreamUtil {

	public static List<Employee> createEmployeeList() {
		List<Employee> employeeList = new ArrayList<>();

		Employee e1 = new Employee("John", 21);
		Employee e2 = new Employee("Martin", 19);
		Employee e3 = new Employee("Mary", 31);
		Employee e4 = new Employee("Stephan", 18);
		Employee e5 = new Employee("Gary", 26);
		Employee e6 = new Employee("John", 26);

		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		employeeList.add(e6);

		return employeeList;
	}

	public static List<Student> getListOfStudents() {
		List<Student> studentList = new ArrayList<>();

		Student s1 = new Student("Peter", 21);
		Student s2 = new Student("Harshal", 18);
		Student s3 = new Student("Andy", 17);
		Student s4 = new Student("Mary", 20);
		Student s5 = new Student("Peter", 19);

		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);

		return studentList;
	}
}
