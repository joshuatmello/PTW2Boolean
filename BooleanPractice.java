
public class BooleanPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int currentAge = 14;
		int drivingAge = 16; 
		boolean canDrive= currentAge >= drivingAge;
		if (currentAge >= drivingAge) {
			System.out.println("Don't drive too fast!");
		} else {
			System.out.println("If you drive, it is not legal.");
		}
		
	//If >=3+ then 1 doz; if >=2- <3 then 2 doz; 
	//if >=1- <2 then 3 doz; if <1 then 4doz
		
		double eggPrice= 4; 
		if (eggPrice < 1) {
		System.out.println("Buy 4 dozen eggs!");		
		} else if (eggPrice >= 1 && eggPrice <2) {
			System.out.println("Buy 3 dozen eggs");		
		} else if (eggPrice >= 2 && eggPrice <3) {
			System.out.println("Buy 2 dozen eggs");
		} else if (eggPrice >= 3) {
			System.out.println("Buy 1 dozen eggs");
		}
		
		double eggCost = 2.5;
		int numberToBuy = 0; 
		if (eggCost >3) {
			numberToBuy= 1;}
		else if (eggCost >2) {
			numberToBuy = 2;}
		else if (eggCost >1) {
			numberToBuy = 3;}
		else {numberToBuy = 4;};
		System.out.println("I will buy " + numberToBuy + " dozen eggs.");
		
	
//	char gradeEarned = 'D'; 
//	switch (gradeEarned) {
//	case 'A': 
//		System.out.println("Congratulations, you got an A!");
//		break;
//	case 'B': 
//		System.out.println("You got a B.");
//		break;
//	case 'C': 
//		System.out.println("You earned a C.");
//		break;
//	default: 
//		System.out.println("You did not pass.");
//	}
	
		char grade = 'D';
		switch (grade) {
		    case 'A':
		        System.out.println("90-100");
		        break;
		    case 'B':
		        System.out.println("80-89");
		        break;
		    case 'C':
		        System.out.println("70-79");
		        break;
		    case 'D':
		        System.out.println("60-69");
		        break;
		    default:
		        System.out.println("0-59");
		}
			
		
		
		String letterGrade;
			//It only accepts int and Strings, not chars or doubles
			int numericGrade = 70;
			// a switch statement works on strings in Java 7 and above
			switch(numericGrade) {
			//They do not have ranges
			case 100: case 99: case 98: case 97: case 96: case 95: case 94: case 93: case 92: case 91: case 90:
			letterGrade = "A";
			break;
			case 89: case 88: case 87: case 86: case 85: case 84: case 83: case 82: case 81: case 80:
			letterGrade = "B";
			break;
			case 79: case 78: case 77: case 76: case 75: case 74: case 73: case 72: case 71: case 70:
			letterGrade = "C";
			break;
			case 69: case 68: case 67: case 66: case 65: case 64: case 63: case 62: case 61: case 60:
			letterGrade = "D";
			break;
			default:
			letterGrade = "F"; // not really needed, but makes the program clearer
			break;
			}
			System.out.println("Your letterGrade is " + letterGrade);
			
			String day = "Saturday";
			String month = "June";
			boolean weekend= (day.equals ("Saturday")) || (day.equals ("Sunday"));
			boolean summer= (month.equals ("June")) || (month.equals ("July")) || (month.equals ("August"));
			
//			int num1= 72;
//			int num2= 24;
//			int num3= 12;
//			int num4= 7;
//			 if (num1 >= num2) {
//		            if (num3 >= num4) {
//		                System.out.println("Both statements are true");
//		            };
//		                };
//		          
//		                
//		                int num = 2;
//		     for (int i =1; i<= 10; i++) {
//		          System.out.println(i * num);
//		                }
//
//		     int x = 5;
//		     if (x <= 0) {
//		         //Use this line for printing to the console if the value of x is less than 1.
//		         System.out.println("Please enter a number greater than 0.");}
//		         else {for (int i= 0; i <= x; i++) {
//		             System.out.println(i); }
		     
		  
		         }
				
}