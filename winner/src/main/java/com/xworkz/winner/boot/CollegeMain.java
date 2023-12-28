package com.xworkz.winner.boot;

import javax.swing.UnsupportedLookAndFeelException;

import com.xworkz.exception.RainException;
import com.xworkz.winner.event.College;

public class CollegeMain {

	
	public static void main(String[] args) {
		
		College college=new College();
		try {
			Class.forName("com.just.not.work");
			try {
				college.walk();
			} catch (RainException e) {
				// TODO Auto-generated catch block
				System.out.println("event is handled");
			}
		} catch (UnsupportedLookAndFeelException e) {
            System.err.println("event occured at the method");
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			System.err.println("event ClassNotFoundException may occur ");
			
		}
		
		
	college.play();
		
	}
}
