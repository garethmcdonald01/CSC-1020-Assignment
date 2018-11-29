package part02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class mainMenu {
	// scanner for user input 
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<supplier> supplierList = new ArrayList<supplier>();

		// creating supplier counts and product counts 
		int subCount = 0;
		int productCount = 0; 
		boolean menuSelect = true;

		// main menu which allows the user to to select which function of the program they wish to use
		while(menuSelect == true) {
			System.out.println("----Please select what you would like to do----");
			System.out.println("1: Print All Products" + "\n 2: Supplier" + "\n 3: Products" + "\n 4: Exit Application");
			int  mainMenu = Validateint();  
			//switch statement catches the users input and directs them to the correct part of the menu
			switch(mainMenu)
			{
			// this allows the user to view all created products for the supplier
			//and prints out all the product information in a list 
			case 1:  
			{
				// validates the user input so they can only choose suppliers that are created 
				if (productCount ==0 )
				{
					System.out.println("please add a product first!");

				}
				else {
					System.out.println("which supplier do you want to use: " );
					for (int i =0; i< supplierList.size(); i++)
					{
						System.out.println(  i +1 + " List: " + supplierList.get(i).getSupName() );

					}
					int supplierSelected = sc.nextInt() -1;

					for (int i =0; i< supplierList.get(supplierSelected).getSupProducts().size(); i++) {
						System.out.println(supplierList.get(supplierSelected).getSupProducts().get(i).getProModel());
					} 
				}

				break;
			}
			// directs the user to the supplier sub menu, here they can choose either to view all created suppliers, 
			//edit a supplier, remove a supplier and create a supplier
			case 2:

				System.out.println("what would you like to do \n [1] View all Supplier details \n [2] edit a supplier \n [3] remove a supplier  \n [4] Create a supplier");
				int supplierChoice = Validateint();
				switch(supplierChoice)
				{
				case 1: // view all suppliers 

					if (subCount == 0)
					{

						System.out.println("please add a supplier first!");
						break; 
					}
					else
					{   // prints out the supplier name and supplier code from the arraylist and formats it into a list
						for (int i =0; i< supplierList.size(); i++)
						{
							System.out.println(i +1 + " List: " + supplierList.get(i).getSupName() + "\n" +supplierList.get(i).getSupCode() + "\n" +  supplierList.get(i).getSupAddress().getAddressDetails());
						}
						break;
					}


				case 2: //edit a supplier 
					// if statement which loads the edit supplier details if there is a supplier created in the application 
					if (subCount == 0)
					{

						System.out.println("please add a supplier first!");
						break; 
					}
					else
					{
						supplierTester.editSupplier(supplierList);
					}
					break;


					//remove a supplier
				case 3: 


					// removes a supplier the user selects if there is suppliers created in the program to delete 
					if (subCount == 0)
					{

						System.out.println("please add a supplier first!");
						break; 
					}
					else
					{
						supplierTester.removeSupplier(supplierList);
					}


					break;
				case 4: // adds a supplier to the arraylist 
					supplierList.add(supplierTester.addSupplier());
					subCount++;
				}
				break;

			case 3:  // product submenu whch allows users to search for a product, add a product to the arraylist and show stock levels for all products
				System.out.println("What would you like to do \n [1]search for a product \n [2] add a product \n [3] stock take");
				int productChoice = Validateint();
				switch (productChoice) 

				{
				case 1: // search for a product in the arraylist 
					// if there is no products in the application it tells the user to add a supplier and product first 
					if (productCount == 0)
					{

						System.out.println("please add a supplier and product first!");
						break; 
					}
					else
					{
						productTester.searchProduct(supplierList);
					}
					break;
				case 2: // adds a product to a supplier which the user selected

					if (subCount == 0)
					{
						System.out.println("please add a supplier first!");
						break;
					}
					else 
					{ //displays all the suppliers in a numbered list with the user can select to add a product to 
						System.out.println("which supplier do you want to use: " );
						for (int i =0; i< supplierList.size(); i++)
						{

							System.out.println(i +1 + " List: " + supplierList.get(i).getSupName() );
						}
						int supplierSelected = Validateint()-1;
						//validation for the list so the user can only choose a number with a supplier connected to it 
						while ( supplierSelected >= supplierList.size())
						{
							System.out.println("Please choose a supplier between the numbers 1 and " + subCount );
							supplierSelected = sc.nextInt()-1;
						}
						// allows the user to add a new product to a selected supplier 
						supplierList.get(supplierSelected).getSupProducts().add((productTester.newProduct()));
						productCount ++;
						break;
					}   
				case 3:  // displays all the stock levels for the products, if no products are present, it asks the user to add a product 

					if (subCount == 0)
					{
						System.out.println("please add a supplier first!");
						break;
						
					}
					else {
						productTester.stockTake(supplierList);
					
					
					}
					
				}
break;			


				// exits the program 
			case 4: 
				System.out.println("application has now closed");
				System.exit(mainMenu);
				break;

			default:

			}
		}
	}






	// validation for user input for the main menu 
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
					System.out.println( "that is not a valid number! make sure the number is positive!\n");
					scInt.next();
				}
				number = scInt.nextInt();
			} while (number <=0);
			break;
		}
		return number;
	}
}




