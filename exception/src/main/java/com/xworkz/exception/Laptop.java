package com.xworkz.exception;

public class Laptop {
	
	public static void work() {
		System.out.println("invoking work in laptop");
		run();
	}
	
	public static void run() {
		System.out.println("invoking run in laptop");
		walk();
	}
	public static void walk() {
		System.out.println("invoking walk in laptop");
		try {
			jog();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("exception event is handled");
		}
		System.out.println("after hanlded");
	}
	
	public static void jog() {
		System.out.println("invoking jog in laptop");
		operate();
	}
	
	public static void operate() {
		System.out.println("invoking operate in laptop");
		throw new NullPointerException();
		
	}
	

}
