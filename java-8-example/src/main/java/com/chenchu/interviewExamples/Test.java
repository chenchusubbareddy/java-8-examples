package com.chenchu.interviewExamples;


public class Test {

	public static void main(String[] args) {
		int n=98476;//946
		String num=n+"";
		String res="";
		for(int i = 0;i<num.length();i++) {
			if(i>=1) {
				if(i%2==0) {
					res=res+num.charAt(i);
				}
			}else {
				res=res+num.charAt(i);
			}
		}
		System.out.println(res);
	}
	
	

}
