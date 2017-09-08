//import javax.swing.JOptionPane;
import javax.swing.*;
class HelloWorld {
	public static void main(String[] args) {
		//final String NAME = System.console().readLine("Type your name: ");
		java.io.Console dos = System.console();
		final String NAME = dos.readLine("Type your name: ");
		
		final String GREETING = "Hello, " + NAME + "!";
		//java.lang.System.out.println(GREETING);
		System.out.println(GREETING);
		javax.swing.JOptionPane.showMessageDialog(null, GREETING);
	}

}