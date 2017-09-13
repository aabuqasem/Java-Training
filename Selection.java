public class Selection {
	public static void main(String[] args) {
	char grade = 'A';
		
		if (grade = 'A' || grade = 'B' ) {
			System.out.println("Good Job");
		}
		else if (grade = 'C' ) {
			System.out.println("You can do better");
		}
		else if (grade = 'D' || grade = 'F' ) {
			System.out.println("You'r grounded!");				
		}
		else
			System.out.println("That's not a valid grade.");
		switch (grade) {
		case 'a': 
		case 'A': 
		case 'b':
		case 'B': System.out.println("Good Job"); break;
		case 'c':
		case 'C': System.out.println("You can do better"); break;
		case 'd':
		case 'D': 
		case 'f': 	
		case 'F': System.out.println("You'r grounded!"); break;	
		default: System.out.println("That's not a valid grade.");
		}
		
	}
}