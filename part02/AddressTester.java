package part02;
import java.util.Scanner;
public class AddressTester {
	public static void main(String [] args)
	{
	}

// method which allows the users input to add an address to a supplier 
	public static Address addAddress() {
		Scanner sc = new Scanner(System.in);
		System.out.println("----Add new Address----");
		System.out.println("Please enter the Address number: ");
		int bldNum = Validateint();
		System.out.println("Please enter the street name:");
		String bldStreet = ValidateString();
		System.out.println("Please enter the town: ");
		String bldTown = ValidateString();

		System.out.println("please enter the postcode: ");
		String bldPcode = ValidateString();

		System.out.println("Please Enter the Country :");
		String bldCountry = ValidateString();

		Address newAddress = new Address(bldNum, bldStreet, bldTown, bldPcode, bldCountry);
		//Address newAddress = new Address(bldNum, bldStreet, bldTown, bldPcode);
		return newAddress;

	}


// user validation for all integers 
	public static int Validateint()
	{
		String intVal;
		int number = 0;
		Scanner scInt = new Scanner(System.in);
		boolean validationGo = true;
		while (validationGo) {
			do 
			{
				while (!scInt.hasNextInt())
				{
					System.out.println("\"%s\"that is not a valid number! make sure the number is positive!\n");
					scInt.next();
				}
				number = scInt.nextInt();
			} while (number <=0);
			break;
		}
		return number;



	}
// user validation for all doubles 
	public static double Validatedouble()
	{
		String doubleVal;
		double number = 0;
		Scanner scdouble = new Scanner(System.in);
		boolean validationGo = true;
		while (validationGo) {
			do 
			{
				while (!scdouble.hasNextDouble())
				{
					System.out.println("\"%s\"that is not a valid number! make sure the number is positive!\n");
					scdouble.next();
				}
				number = scdouble.nextDouble();
			} while (number <=0);
			break;
		}
		return number;



	}
	//user validation for all strings 
	public static String ValidateString()
	{
		
		Scanner scString = new Scanner(System.in);
		String input = scString.nextLine();
		boolean validationGo = true;
		while (validationGo) {
			do 
			{
				while (input.length() >20)
				{
					System.out.println("the string is too long, max character count is 20");
					 input = scString.nextLine();
					
				}
				break;
				
				
			} while (input.length() > 20);
			break;
		}
		return input;
		
	}


}

