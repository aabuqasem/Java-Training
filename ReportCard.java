public class ReportCard {
	public static void main(String[] args) {
		final String GRADE = System.console().readLine("Enter your letter grade: ");
		
		if (GRADE.equalsIgnoreCase("A") || "B".equalsIgnoreCase(GRADE) ) {
			System.out.println("Good Job");
		}
		else if (GRADE.equalsIgnoreCase("C")) {
			System.out.println("You can do better");
		}
		else if (GRADE.equalsIgnoreCase("D") || GRADE.equalsIgnoreCase("F") ) {
			System.out.println("You'r grounded!");				
		}
		else
			System.out.println("That's not a valid grade.");
		
		
		final String FIXED = GRADE.toUpperCase();
		switch (GRADE) {		
		case "A": 
		case "B": System.out.println("Good Job"); break;
		case "C": System.out.println("You can do better"); break;
		case "D": 
		case "F": System.out.println("You'r grounded!"); break;	
		default: System.out.println("That's not a valid grade.");
		}
	}
}