package part01;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Scanner;
public class supplierTester {

	public static void main(String[] args) {
		supplier newSupplier = addSupplier();
		System.out.println(newSupplier.getsupplierDetails());
	}
	//method which creates an address for a supplier and adds it to the supplier informtion
public static supplier addSupplier()
{
	ArrayList<product> productList = new ArrayList<product> ();
	Scanner sc = new Scanner (System.in);
	System.out.println("----Add Supplier----");
	System.out.println("Please enter the Supplier Code: ");
	int supCode = sc.nextInt();
	sc.nextLine();
	System.out.println("Please enter the Supplier name:" );
	String supName = sc.nextLine();
	System.out.println("Please enter the Supplier Address: ");
	Address supAddress = AddressTester.addAddress();
	System.out.println("Please choose the region which the compnay is based, use (1,2,3):" );
	 
	int index =1;
	int numOfItems = EnumSet.allOf(SupRegion.class).size();
	Printitems(index, numOfItems);
	SupRegion region = SupRegion.values() [sc.nextInt()-1];
	
	//prints out the supplier regions from the enum 
	for (SupRegion regionValues : SupRegion.values())
	{
		System.out.println(regionValues);
	}
	
	
	
	supplier newSupplier = new supplier(supCode, supName, supAddress, region, productList);
	return newSupplier;
	
}


//prints all the enum informaion out in a readible way 
public static void Printitems (int index, int numOfItems)
{
	if (index <= numOfItems)
	{
		System.out.println(index + ":" + SupRegion.values() [index-1].getRegionAsString());
		index++;
		Printitems(index,numOfItems);
	}
}





}

/*public class supplier {
private supCode;
private String supName;
private Address supAddress;
private SupRegion supRegion;
private  ArrayList<String> supProducts ;*/
