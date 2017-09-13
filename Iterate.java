public class Iterate {
	public static void main (String[] args) {
		final String text = System.console().readLine("Enter your text: ");
		final String NUM = System.console().readLine("Enter your iteration number: ");
		
		
		int count = Integer.parseInt(NUM); 
		
		for(int i = 0; i < count; i++) {
			System.out.println(text);	
		}
	}
}