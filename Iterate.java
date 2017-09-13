public class Iterate {
	public static void main (String[] args) {

		if(args.length != 2) {
			System.out.println(
					"Usage: java Iterate (string) (times)"
			);
			return;
		}
		final int COUNT = Integer.parseInt(args[1]); 
		
		for(int n = 0; n < COUNT; n++) {
			System.out.print(args[0]);	
		}
	}
}
