package part02;

import java.util.ArrayList;
import java.util.Scanner;
public class productTester {
	//scanner for user input 
    public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
product newProduct = addProduct();
System.out.println(newProduct.GetProductDetails());
	}
	//declaring the new product method
	public static product newProduct()
	{
		  
		 return addProduct();
	}
//method which allows the user to add a new product into the arraylist
	public static product addProduct()
	{ 
		System.out.println("----Add new Product----");
		System.out.println("\nPlease enter the Product code:");
		int proCode = Validateint();
	    System.out.println("Please enter the Product make:");
	    String proMake = ValidateString();
	    System.out.println("Please enter the Product model:");
	    String proModel = ValidateString();
	    System.out.println("Please enter the product quantity: ");
	    int proQtyAvailable = Validateint();
	    System.out.println("Please enter the Product price:");
	    double proPrice = Validatedouble();
	    System.out.println("Please enter [yes] if the product is discontinued or [no] if the product is not:");
	      String Discontinued = sc.nextLine();
	      boolean proDiscontinued = false;
	      //if statement to capture multiple yes anwsers for the boolean 
	    if ( Discontinued == "Y" || Discontinued == "y" ||  Discontinued =="yes"  )
		   {
			   proDiscontinued = true;
		   }
	    else  
	    {
	    	proDiscontinued = false;
	   
	    }
	    // declaring what is in the newproduct method 
	    product newProduct = new product (proCode, proMake, proQtyAvailable, 
		          proModel, proPrice, proDiscontinued);
	    return newProduct;
	    
	   
	    
	}
	
	//method which allows the user to search for specific products by calling all products from the arraylist and displaying 
	// their make and their details 
	 public static void searchProduct(ArrayList<supplier> searchList)
	    {
		 ArrayList<product> productList = new ArrayList<product>();
	    	for (int i=0; i<searchList.size(); i++)
	    	{
	    		productList.addAll(searchList.get(i).getSupProducts());
	    	}
	    	for (int a =0; a<productList.size(); a++)
	    	{
	    		System.out.println( a  + 1 + productList.get(a).proMake);
	    	}
	    	int productChoice = sc.nextInt() -1;
	    
	    	System.out.println(productList.get(productChoice).GetProductDetails());
	    	
	    }
//method which allows the user to see all the stock levels for all the products in the arraylist 
	 public static void stockTake (ArrayList<supplier> searchList)
	 {
		 ArrayList<product> stockTake = new ArrayList<product>();
	    	for (int i=0; i<searchList.size(); i++)
	    	{
	    		stockTake.addAll(searchList.get(i).getSupProducts());
	    	}
	    	for (int a =0; a<stockTake.size(); a++)
	    	{System.out.println(  "============"  + "\nmake: "  + stockTake.get(a).proMake);
	    		System.out.println( "stock left: " + stockTake.get(a).proQtyAvailable);
	    	}
	    	
	 }
	
//validates all integer values inputted by the user 
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
//valites all the double values inputted by the user 
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
						System.out.println("that is not a valid number! make sure the number is positive!\n");
						scdouble.next();
					}
					number = scdouble.nextDouble();
				} while (number <=0);
				break;
			}
			return number;



		}
		//validates all the string values inputted by the user
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
						System.out.println("too many characters, max character count is 20");
						 input = scString.nextLine();
						
					}
					break;
					
					
				} while (input.length() > 20);
				break;
			}
			return input;
			
		}
}


