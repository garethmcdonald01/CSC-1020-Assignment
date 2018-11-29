package part02;
import java.util.ArrayList;
//declaring all the variables for the supplier class
public class supplier {
private int supCode;
private String supName;
private Address supAddress;
private SupRegion supRegion;
private  ArrayList<product> supProducts ;


public supplier(int supCode, String SupName, Address supAddress, SupRegion supRegion, ArrayList<product> supProducts)
{
	this.supCode = supCode;
	this.supName = SupName;
	this.supAddress = supAddress;
	this.supRegion = supRegion;
	this.supProducts = supProducts;


	
}
// getters and setters for the supplier class
public int getSupCode() {
	return supCode;
}


public void setSupCode(int supCode) {
	this.supCode = supCode;
}


public String getSupName() {
	return supName;
}


public void setSupName(String supName) {
	this.supName = supName;
}


public Address getSupAddress() {
	return supAddress;
}


public void setSupAddress(Address supAddress) {
	this.supAddress = supAddress;
}


public SupRegion getSupRegion() {
	return supRegion;
}


public void setSupRegion(SupRegion supRegion) {
	this.supRegion = supRegion;
}


public ArrayList<product> getSupProducts() {
	return supProducts;
}

// declaring the arraylist supProducts 
public void setSupProducts(ArrayList<product> supProducts) {
	this.supProducts = supProducts;
}
// method which displays the supplier information in an order form 
public String getsupplierDetails()
{
	String returnString = "----Supplier Details----";
			returnString += "Code: " + supCode + "\nName;" + supName + "\nAddress:" + supAddress;
			returnString += "\nRegion:" + supRegion + "\nProducts:" + supProducts;
			return returnString;
}









}
