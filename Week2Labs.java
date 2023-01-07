
public class Week2Labs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 15;
		boolean hasLicense = true;
		
		System.out.println(age >= 16 && hasLicense); 
		if (age >= 16) {
			System.out.println("You can drive.");
		} else {System.out.println("You cannot drive.");};
		
		
		double costOfMilk= 3;
		double thirstLevel= 5;
		if (costOfMilk < 2.5 || thirstLevel > 6) {
			System.out.println("Milk please.");
			} else {System.out.println("No thanks");}
				
		int numberOfCookies = 3;
		int numberOfChildren= 2; 
		int numberOfAdultCookies= numberOfCookies % numberOfChildren; 
		
		
		String localMemberStatus = "SILVER";
		double loyaltyMemberDiscount = 0.0;
		switch (localMemberStatus) {
			case "SILVER": 
				loyaltyMemberDiscount= .1;
				break; 
			case "GOLD": 
				loyaltyMemberDiscount = .15;
				break;
			case "PLATINUM": 
				loyaltyMemberDiscount= .25;
				break;
			default: 
				loyaltyMemberDiscount= 0;}
		
		System.out.println(loyaltyMemberDiscount);
		
		double billTotal= 777; 
		double adjustedTotal = billTotal - (loyaltyMemberDiscount*billTotal);
		if (adjustedTotal > 500) {
			switch (localMemberStatus) {
				case "SILVER": 
					localMemberStatus= "GOLD";
						break;
				case "GOLD":
					localMemberStatus= "PLATINUM";
			} System.out.println("Your new Local Member Status has been upgraded to " + localMemberStatus);
		} 
		
//		for (int i= 0; i<10; i ++) {
//			System.out.println(i);
//		}
//		
//		for (int i = 10; i>= 0; i-= 1) {
//			System.out.println(i);
//		}
		
//		for (int i= 0; i <= 100; i += 1) {
//			System.out.println(i);
//			if (i % 2 == 0) {
//				System.out.println("Even");
//				} else {System.out.println("Odd");}
//			}
		
//		for (int i = 100; i == 0; i -=1) {
////			System.out.println(i);
//		}
	

		
		
	
	
	}
		
		
		
		}
	
