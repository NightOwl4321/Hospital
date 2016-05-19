package acception;

import javax.swing.JOptionPane;

public class classy {
	
	public static void main(String[] args) throws OutOfStyle, NotCool {
		String cheese = JOptionPane.showInputDialog("Give me a thing and I'll tell you if it is cool");
		hipThings(cheese);
	}

	private static void hipThings(String s) throws NotCool, OutOfStyle {
		if(s.contains("casting")) {
			throw new NotCool("\"Casting isn't really useful\" - June Clarke 2k16");
		} if(s.contains("implements")) {
			throw new NotCool("no");
		} if(s.contains("rekt")) {
			throw new OutOfStyle("get out");
		}
		
		
	}

	//Create a new Exception class called ‘NotCoolExecption’ with constructor.

	//Create a new Exception class called ‘OutOfSyleException’ that will inherit from NotCoolExeption with a Constructor.

	//Create a new class called ‘Popular’ with a main method.

	//Create a “hipThings” method that will throw a NotCoolException, and/or OutOfStyleException if an input is uncool.

	//Use syso and the Scanner class to ask the user for everyday things and call the hipThings’ Method
	//:)

}
