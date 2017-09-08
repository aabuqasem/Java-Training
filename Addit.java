public class Addit {
	public static void main(String[] args) {
	//final String NUM1 = System.console().readLine("Enter a number: ");
	//final String NUM2 = System.console().readLine("Enter another number: ");
	
	//final String NUM1 = args[0];
	//final String NUM2 = args[1];
	
	int num1 = Integer.parseInt(args[0]);
	int num2 = Integer.parseInt(args[1]);
	
	int sum = num1 + num2;
	
	System.out.println(sum);
	}
	
}