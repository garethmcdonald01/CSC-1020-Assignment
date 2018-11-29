package part01;

public class Address {
 private int bldNum;
 private String bldStreet;
 private String bldTown;
 private String bldPcode;
 private String bldCountry;
 //setting up all private varibles and using getters and setters to make ublic versions 
	public Address (int bldNum,  String bldStreet, String bldTown, String bldPcode, String bldCountry)
	{
		this.bldNum = bldNum;
		this.bldStreet = bldStreet;
		this.bldTown = bldTown;
		this.bldPcode = bldPcode;
		this.bldCountry = bldCountry;
	
	}
	public int getBldNum() {
		return bldNum;
	}
	public void setBldNum(int bldNum) {
		this.bldNum = bldNum;
	}
	public String getBldStreet() {
		return bldStreet;
	}
	public void setBldStreet(String bldStreet) {
		this.bldStreet = bldStreet;
	}
	public String getBldTown() {
		return bldTown;
	}
	public void setBldTown(String bldTown) {
		this.bldTown = bldTown;
	}
	public String getPcode() {
		return bldPcode;
	}
	public void setPcode(String pcode) {
		bldPcode = pcode;
	}
	public String getBldCountry() {
		return bldCountry;
	}
	public void setBldCountry(String bldCountry) {
		this.bldCountry = bldCountry;
	}
	
	//method which displays all the user information in an ordered form 
	public String getAddressDetails()
	{
	String returnString = "----Game Details----"; 
		returnString += "\nNumber: " + bldNum + "\nStreet Name: " + bldStreet;
		returnString += "\nTown: " + bldTown + "\nPostcode: " + bldPcode + "\nCountry: " + bldCountry; 
		return returnString;
	}

}
