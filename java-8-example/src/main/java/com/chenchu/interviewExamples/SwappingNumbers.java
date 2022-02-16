package com.chenchu.interviewExamples;

import java.util.Stack;

public class SwappingNumbers {
	public static void main(String[] args) {
			
		int n1=123;
		int n2=456;
		int temp;
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("after swapping  n1 :"+n1 +"  n2="+n2);
		
		//without third variable
		int i1=123;
		int i2=456;
		i1=i1+i2;
		i2=i1-i2;
		i1=i1-i2;
		System.out.println("after swapping  n1 :"+i1 +"  n2="+i2);
		
		
		Stack<Integer> stack = new Stack<Integer>();
	      int[] myArray = {23, 93, 56, 92, 39};
	      int size = myArray.length;
	      for(int i=0; i<size; i++) {
	         stack.push(myArray[i]);
	      }
	      System.out.println(stack);
	      int[] reverseArray = new int[size];
	      int size2 = stack.size();
	      
	      for(int i=0; i<size2; i++) {
	         System.out.println( stack.pop());
	      }
	      
	}
}
