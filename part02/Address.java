package part02;

public class Address {
	//declaring all varibles 
 private int bldNum;
 private String bldStreet;
 private String bldTown;
 private String bldPcode;
 private String bldCountry;
	public Address (int bldNum,  String bldStreet, String bldTown, String bldPcode, String bldCountry)
	{
		this.bldNum = bldNum;
		this.bldStreet = bldStreet;
		this.bldTown = bldTown;
		this.bldPcode = bldPcode;
		this.bldCountry = bldCountry;
	
	}
	// getters and setters for the address class
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
	//adds all the address information togeather so the user can clearly see the information 
	public String getAddressDetails()
	{
	String returnString = "----Address Details----"; 
		returnString += "\n Number: " + bldNum + "\nStreet Name: " + bldStreet;
		returnString += "\n Town: " + bldTown + "\nPostcode: " + bldPcode + "\nCountry: " + bldCountry; 
		return returnString;
	}

}
