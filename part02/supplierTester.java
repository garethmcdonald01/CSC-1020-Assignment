package part02;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Scanner;
public class supplierTester {
	public static  Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		supplier newSupplier = addSupplier();
		System.out.println(newSupplier.getsupplierDetails());
	}
// method which allows the user to add a supplier 
	public static supplier addSupplier()
	{
		ArrayList<product> productList = new ArrayList<product> ();

		System.out.println("----Add Supplier----");
		System.out.println("Please enter the Supplier Code: ");
		int supCode = Validateint();
		System.out.println("Please enter the Supplier name:" );
		String supName = ValidateString();
		System.out.println("Please enter the Supplier Address: ");
		Address supAddress = AddressTester.addAddress();
		System.out.println("Please choose the region which the compnay is based, use (1,2,3):" );
// displays the enum values in the class
		int index =1;
		int numOfItems = EnumSet.allOf(SupRegion.class).size();
		Printitems(index, numOfItems);
		SupRegion region = SupRegion.values() [sc.nextInt()-1];

// prints out the region values in the enum 
		for (SupRegion regionValues : SupRegion.values())
		{
			System.out.println(regionValues);
		}
// adds varibles to the newsSupplier method
		supplier newSupplier = new supplier(supCode, supName, supAddress, region, productList);
		return newSupplier;

	}

	public static void Printitems (int index, int numOfItems)
	{
		if (index <= numOfItems)
		{
			System.out.println(index + ":" + SupRegion.values() [index-1].getRegionAsString());
			index++;
			Printitems(index,numOfItems);
		}
	}
	
	//method which removes the created suppliers from the arraylist 
	public static void removeSupplier( ArrayList<supplier> removeSupplier)
	{
		for ( int i =0; i< removeSupplier.size(); i++)
		{
			System.out.println(  i + 1 + removeSupplier.get(i).getSupName());
		}
		int supplierRemove = Validateint()-1;
		removeSupplier.remove(supplierRemove);
		System.out.println("Supplier has been removed");

	}
	//method which allows the user to edit all the information from the supplier arraylist 
	public static void editSupplier(ArrayList<supplier> editSupplier)
	{
		for (int i=0; i<editSupplier.size(); i++)
		{
			System.out.println(i + 1 + editSupplier.get(i).getSupName());
		}
		//allows the user to select a certin part to edit 
		int supplierEdit = Validateint()-1;
		System.out.println("what part do you want to edit:");
		System.out.println("[1]" + editSupplier.get(supplierEdit).getSupName());
		System.out.println("[2]" + editSupplier.get(supplierEdit).getSupCode());
		System.out.println("[3]" + editSupplier.get(supplierEdit).getSupAddress().getAddressDetails());
		System.out.println("[4]" + editSupplier.get(supplierEdit).getSupRegion().getRegionAsString());
		int editChoice = Validateint();
		//if statements allows the user to select which part to edit, then edit that art of the supplier 
		if (editChoice == 1)
		{
			System.out.println("What would you like to change the supplier name to: ");
			String editsupName = ValidateString();
			editSupplier.get(supplierEdit).setSupName(editsupName);
			System.out.println("the suppliers name has been successfully changed to " + editsupName);
		}
		if( editChoice == 2)
		{
			System.out.println("What would you like to change the supplier code to: ");
			int editSupCode = Validateint();
			editSupplier.get(supplierEdit).setSupCode(editSupCode);
			System.out.println("the supplier code has been successfully changed to " + editSupCode);
		}
		if(editChoice ==3)
		{
			System.out.println("what would you like to change the supplier Address to: ");
			Address EditAddress = AddressTester.addAddress();
			editSupplier.get(supplierEdit).setSupAddress(EditAddress);
			System.out.println("the supplier address has been successfully changed " );
		}
		if (editChoice ==4)
		{
			System.out.println("what would you like to change the supplier Region to: ");
			int index =1;
			int numOfItems = EnumSet.allOf(SupRegion.class).size();
			Printitems(index, numOfItems);
			SupRegion region = SupRegion.values() [sc.nextInt()-1];
			editSupplier.get(supplierEdit).setSupRegion(region);
			System.out.println("the supplier Region has been sucessfully updated to " + region);
		}
		
	}
	//validates all integer values entered by teh user 
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
//validates all doubles values entered by the user
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
	//validates all the string values entered by the user 
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
					System.out.println("\"%s\"that is not a valid number! make sure the number is positive!\n");
					 input = scString.nextLine();
					
				}
				break;
				
				
			} while (input.length() > 20);
			break;
		}
		return input;
		
	}
}
