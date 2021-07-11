package com.chenchu.interviewExamples;

import java.util.StringJoiner;

public class Example1 {
	public static void main(String[] args) {
		// input :  position 1 no. @ Durga is This
		//output :  This is Durga @ no. 1 position
		
		String input =  "position 1 no. @ Durga is This";
		String[] split = input.split(" ");
		StringJoiner sj = new StringJoiner(" ");
		for(int i=split.length-1;i!=-1;i--) {
			sj.add(split[i]);
		}
		System.out.println(sj);
	}
}
