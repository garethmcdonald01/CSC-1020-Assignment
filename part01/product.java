package part01;

public class product {

	 int proCode;
	 int proQtyAvailable;
	 String proMake;
	 String proModel;
	 double proPrice;
	 boolean proDiscontinued;
	 
	 //declaring all varibles and declaring the getters and setters to make them public 
	 public product (int proCode, int proQtyAvailable, String proMake,
			         String proModel, boolean proDiscontinued, double proPrice)
	 {
		 this.proCode = proCode;
		 this.proQtyAvailable = proQtyAvailable;
		 this.proMake = proMake;
		 this.proModel = proModel;
		 this.proPrice = proPrice;
		 this.proDiscontinued = proDiscontinued;
	 }

	public int getProCode() {
		return proCode;
	}

	public void setProCode(int proCode) {
		this.proCode = proCode;
	}

	public int getProQtyAvailable() {
		return proQtyAvailable;
	}

	public void setProQtyAvailable(int proQtyAvailable) {
		this.proQtyAvailable = proQtyAvailable;
	}

	public String getProMake() {
		return proMake;
	}

	public void setProMake(String proMake) {
		this.proMake = proMake;
	}

	public String getProModel() {
		return proModel;
	}

	public void setProModel(String proModel) {
		this.proModel = proModel;
	}

	public double getProPrice() {
		return proPrice;
	}

	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}

	public boolean isProDiscontinued() {
		return proDiscontinued;
	}

	public void setProDiscontinued(boolean proDiscontinued) {
		this.proDiscontinued = proDiscontinued;
	}
	 //string which  organises the varibles to display useful information  
public String GetProductDetails()
{
	String returnString = "----Product Details----";
	returnString += "Product Code:" + proCode + "\nQuantity Availible: " + proQtyAvailable + "\nProduct Make:" + proMake + "\nProduct model:" + proModel + "\nProductPrice: " 
			         + proPrice + "\nProduct Discontinued: " + proDiscontinued;
	return returnString;
}
}
