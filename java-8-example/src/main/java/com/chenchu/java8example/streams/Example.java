package com.chenchu.java8example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
	public static void main(String[] args) {
		List<String> letters = Arrays.asList("B", "A", "C");

		List<String> collect = letters.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);
		List<String> collect2 = letters.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect2);

		List<Student> studentsList = getListOfStudents();

		List<Student> sortedStudentsList = studentsList.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
		
		System.out.println(sortedStudentsList);
		List<Student> sortedStudentsList1 = studentsList.stream().sorted(Comparator.comparing(Student::getName).thenComparing(Student::getAge)).collect(Collectors.toList());
		
		System.out.println(sortedStudentsList1);
		

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

class Student{

	String name;
	int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
