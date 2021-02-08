package com.chenchu.java8example.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.chenchu.java8example.streams.WordountJava8.User;

public class WordountJava8 {

	public static void main(String[] args) {
		List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");

		Map<String, Long> result = items.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(result);

		List<Integer> numlist = Arrays.asList(2, 4, 56, 7, 32, 3456, 2);
		List<Integer> collect = numlist.stream().sorted().collect(Collectors.toList());
		List<Integer> collect1 = numlist.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect);
		System.out.println(collect1);
		System.out.println("--------------------------------------------------");
		List<User> users = Arrays.asList(new User("C", 30), new User("D", 40), new User("A", 10), new User("B", 20),
				new User("E", 50));
		List<User> collect2 = users.stream().sorted(Comparator.comparingInt(User::getAge).reversed()).collect(Collectors.toList());
		System.out.println(collect2);
	}

	static class User {

		private String name;
		private int age;

		public User(String name, int age) {
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
			return "User{" + "name='" + name + '\'' + ", age=" + age + '}';
		}
	}

}
