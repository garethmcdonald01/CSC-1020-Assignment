package part01;
import java.util.ArrayList;

public class supplier {
private int supCode;
private String supName;
private Address supAddress;
private SupRegion supRegion;
private  ArrayList<product> supProducts ;

//declaring all varibles and using getters and setters to make the private varibles public 
public supplier(int supCode, String SupName, Address supAddress, SupRegion supRegion, ArrayList<product> supProducts)
{
	this.supCode = supCode;
	this.supName = SupName;
	this.supAddress = supAddress;
	this.supRegion = supRegion;
	this.supProducts = supProducts;


	
}

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


public void setSupProducts(ArrayList<product> supProducts) {
	this.supProducts = supProducts;
}
// string which displays the varibles in an organised way for the user to read
public String getsupplierDetails()
{
	String returnString = "----Supplier Details----";
			returnString += "Code: " + supCode + "\nName;" + supName + "\nAddress:" + supAddress;
			returnString += "\nRegion:" + supRegion + "\nProducts:" + supProducts;
			return returnString;
}









}
