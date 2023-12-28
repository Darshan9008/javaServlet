package com.xworkz.winner.event;
import com.xworkz.exception.*;
import javax.swing.UnsupportedLookAndFeelException;

import com.xworkz.exception.RainException;

public class College {

	public void play() {
		throw new NullPointerException();
		
	}
	
	public void run() {
		
		
}
	
	public void walk() throws UnsupportedLookAndFeelException, RainException{
		
		//throw new UnsupportedLookAndFeelException(null);
		throw new RainException();
		

		
}
}