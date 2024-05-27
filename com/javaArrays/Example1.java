package com.javaArrays;
//command line argument we can read value form console
public class Example1 {
	
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		int c = Integer.max(1, 1);
		
		System.out.println(a+b);
		System.out.println(c);
	}

}
