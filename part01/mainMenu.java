package part01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class mainMenu {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<supplier> supplierList = new ArrayList<supplier>();
		
		    
       int subCount = 0;
       int productCount = 0; 
       boolean menuSelect = true;
       while(menuSelect = true) {
    	   System.out.println("----Please select what you would like to do----");
           System.out.println("1: Print All Products" + "\n 2: Add New Supplier" + "\n 3: Add New Product" + "\n 4: Exit Application");
    	   int  mainMenu = sc.nextInt();  
    	   //switch statement which allows the user to select which part of the program to use 
    	   
       switch(mainMenu)
       {
       //case 1 allows the user to view all created products in the arraylist 
         case 1:  
    	   { if (subCount == 0)
    	   {
    		   System.out.println("please add a supplier first!");
    		   break;
    		   
    	   }
    	   else 
    	   {//displays all the suppliers which products are assoated with 
    		   System.out.println("which supplier do you want to use: " );
        	   for (int i =0; i< supplierList.size(); i++)
        	   {
        		   System.out.println(i +1 + " List: " + supplierList.get(i).getSupName() );

        	   }
        	   int supplierSelected = sc.nextInt() -1;
        	   //displays the product details 
          for (int i =0; i< supplierList.get(supplierSelected).getSupProducts().size(); i++) {
        	  System.out.println(supplierList.get(supplierSelected).getSupProducts().get(i).getProModel());
          } 
          break;
        	  
           
    	   }
    	   }
           case 2: //allows the user to add a supplier to the arraylist 
        	 supplierList.add(supplierTester.addSupplier());
        	 System.out.println(supplierList.get(0).getSupName());
        	 subCount++;
        	 break;
        	 
           case 3:  //allows the user to create a product and link it to a supplier 
        	   if (subCount == 0)
        	   {
        		   System.out.println("please add a supplier first!");
        		   break;
        		   
        	   }
        	   else 
        	   {// displays the suppliers all in a list and allows teh user to select one 
        		   System.out.println("which supplier do you want to use: " );
            	   for (int i =0; i< supplierList.size(); i++)
            	   {
            		   System.out.println(i +1 + " List: " + supplierList.get(i).getSupName() );

            	   }
            	   int supplierSelected = sc.nextInt() -1;
            	  
// only allows the user to select a supplier number within the number range of the supplierlist size
            	   while ( supplierSelected >= supplierList.size())
					{
						System.out.println("Please choose a supplier between the numbers 1 and " + subCount );
						supplierSelected = sc.nextInt()-1;
					}
            	   supplierList.get(supplierSelected).getSupProducts().add((productTester.newProduct()));
              
               System.out.println(supplierList.get(0).getSupProducts().get(0).getProPrice());
               break;
        	   }
        	   
           //exits the program 
           case 4: System.exit(mainMenu);
           break;
           
           default:
       }
      }
       }
	
	}




