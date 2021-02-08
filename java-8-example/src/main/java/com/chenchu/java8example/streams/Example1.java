package com.chenchu.java8example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

public class Example1 {

	public static void main(String args[]) {
		List<Employee> employeeList = createEmployeeList();
		List<String> employeeFilteredList = employeeList.stream().filter(e -> e.getAge() > 20).map(Employee::getName)
				.collect(Collectors.toList());

		employeeFilteredList.forEach((name) -> System.out.println(name));

		long count = employeeList.stream().filter(e -> e.getAge() > 25).count();
		System.out.println("Number of employees with age 25 are : " + count);

		Optional<Employee> e1 = employeeList.stream().filter(e -> e.getName().equalsIgnoreCase("Mary")).findAny();

		if (e1.isPresent())
			System.out.println(e1.get());

		OptionalInt max = employeeList.stream().mapToInt(Employee::getAge).max();
		
		if (max.isPresent())
			System.out.println("Maximum age of Employee: " + max.getAsInt());

		employeeList.sort((e11, e2) -> e11.getAge() - e2.getAge());
		employeeList.forEach(System.out::println);

		String collect = employeeList.stream().map(Employee::getName).collect(Collectors.joining(","));

		System.out.println("Employees are: " + collect);

		Map<String, List<Employee>> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getName));
		System.out.println(map);

		// remove duplicates
		Integer[] arr = new Integer[] { 1, 2, 3, 4, 3, 2, 4, 2 };
		List<Integer> listWithDuplicates = Arrays.asList(arr);

		Set<Integer> setWithoutDups = listWithDuplicates.stream().collect(Collectors.toSet());

		List<Integer> listWithoutDups = listWithDuplicates.stream().distinct().collect(Collectors.toList());
		listWithoutDups.forEach((i) -> System.out.print(" " + i));
		
		
		 Integer[] arr1=new Integer[]{100,24,13,44,114,200,40,112};
	        List<Integer> list = Arrays.asList(arr1);
	        OptionalDouble average = list.stream()
	                                 .mapToInt(n->n*n)
	                                 .filter(n->n>10000)
	                                 .average();
	 
	        if(average.isPresent())
	            System.out.println(average.getAsDouble());
	        
	        
	}

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
}
