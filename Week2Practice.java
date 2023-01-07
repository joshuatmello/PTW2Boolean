
public class Week2Practice {
	public static void main(String[] args) {
		
		char gradeEarned = 'D'; 
		switch (gradeEarned) {
		case 'A': 
			System.out.println("Congratulations, you got an A!");
			break;
		case 'B': 
			System.out.println("You got a B.");
			break;
		case 'C': 
			System.out.println("You earned a C.");
			break;
		default: 
			System.out.println("You did not pass.");
		}
	}

}
