import java.util.Scanner; 


public class carRental {
	public static void main(String[] args){			
	/*This "input can be named anything, but it will be used for user inputs*/
	Scanner input = new Scanner (System.in); 		

	/*Selection Prompt*/
	int carType; 
	System.out.print("Hello, Welcome to BobCar Rental Service!"); 
	System.out.println("Please select the type of vehicle you would like..."); 
	System.out.print("(1)Economy Class (2) Compact Class (3) Standard Class : "); 
	carType = input.nextInt(); 
	
	/*Determination of Price*/
	int carPrice = 0;
	
	if( carType == 1)
	{
		System.out.println("You chose the Economy Class. Great selection for saving on fuel.");  
		carPrice = 25; 
	}
	
	if(carType == 2)
	{
		System.out.println("You chose the Compact Class. A great selection for a good time."); 
		carPrice = 55; 
	}
	
	if(carType == 3)
	{
		System.out.println("You chose the Standard Class. An excellent choice for a comfortable ride."); 
		carPrice = 100;
	}
	
	int daysOfRental; 
	System.out.print("Now that you have chosen your desired vehicle, select the amount of days you would like to use it: "); 
	daysOfRental = input.nextInt(); 
	
	int clubMember; 
	System.out.println("Are you a Premium Club Member? (1) Yes (2) No "); 
	clubMember = input.nextInt(); 
	
	
	int finalPrice = carPrice * daysOfRental; 
	
	if(clubMember == 1)
	{
		int discountPrice = -1  * carPrice * (daysOfRental / 5); 
		
		int platChoice; 
		System.out.println("Since you are a Premium Club Member we are offering you a Platinum Executive Package!Would you like it? (1) Yes (2) No"); 
		platChoice = input.nextInt(); 
		
		int platPack = 0; 
		if(platChoice == 1)
		{
			platPack = (int) (finalPrice * .20); 		//convert to int
		}
		
		int total = finalPrice + discountPrice + platPack; 
		
		System.out.println("Original Price: " + finalPrice);
		System.out.println("Premium Club Member Discount: " + discountPrice); 
		System.out.println("Platinum Executive Package: " + platPack); 
		System.out.println("Your total is: " + total); 
	}
	
	int total = finalPrice;
	
	if ( clubMember == 2)
	{
		System.out.println("Original Price: " + finalPrice );
		System.out.println("Premium Club Member Discount: " + 0 ); 
		System.out.println("Platinum Executive Package: " + 0); 
		System.out.println("Your total is: " + total); 
		
	}

	
}
}