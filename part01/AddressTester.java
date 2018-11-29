package part01;
import java.util.Scanner;
public class AddressTester {
public static void main(String [] args)
{
}

//method which adds the address to the supplier arraylist
public static Address addAddress() {
	Scanner sc = new Scanner(System.in);
	System.out.println("----Add new Address----");
	System.out.println("Please enter the Address number: ");
	int bldNum = sc.nextInt();
	System.out.println("Please enter the street name:");
	String bldStreet = sc.next();
	sc.nextLine();
	System.out.println("Please enter the town: ");
	String bldTown = sc.next();
	sc.nextLine();
	
	System.out.println("please enter the postcode: ");
	String bldPcode = sc.next();
	
	System.out.println("Please Enter the Country :");
	String bldCountry = sc.next();
	
	
	//method which adds varibles to the newaddress method
	Address newAddress = new Address(bldNum, bldStreet, bldTown, bldPcode, bldCountry);
	//Address newAddress = new Address(bldNum, bldStreet, bldTown, bldPcode);
	return newAddress;
}


}

