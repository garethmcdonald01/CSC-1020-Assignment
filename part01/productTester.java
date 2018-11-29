package part01;

import java.util.Scanner;
public class productTester {

	public static void main(String[] args) {
		//creating a new address to add to the arraylist 
product newProduct = addProduct();
System.out.println(newProduct.GetProductDetails());
	}
	
	public static product newProduct()
	{
		  //product  newProduct = addProduct();
		 return addProduct();
	}
	
	
	
	
	//method to add a product to a supplier then to the supplier arraylist 
	public static product addProduct()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("----Add new Product----");
		System.out.println("\nPlease enter the Product code:");
		int proCode = sc.nextInt();
	    System.out.println("Please enter the Product make:");
	    String proMake = sc.next();
	    sc.hasNextLine();
	    System.out.println("Please enter the Product model:");
	    String proModel = sc.next();
	    sc.nextLine();
	    System.out.println("Please enter the product quantity: ");
	    int proQtyAvailable = sc.nextInt();
	    sc.nextLine();
	    System.out.println("Please enter the Product price:");
	    double proPrice = sc.nextDouble();
	    sc.nextLine();
	    System.out.println("Please enter [true] if the product is discontinued or [false] if the product is not:");
	    boolean proDiscontinued = sc.nextBoolean();
	   
	    product newProduct = new product (proCode, proQtyAvailable, proMake,
		          proModel, proDiscontinued, proPrice);
	    return newProduct;
	    
	    
	    
	}

}


