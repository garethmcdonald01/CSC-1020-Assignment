package part02;
// adds different regions to the enum so the user can select them from a list 
public enum SupRegion {
UNITED_KINGDOM {
	@Override
	String getRegionAsString() {
		// TODO Auto-generated method stub
		return "United Kingdom";
	}
}, EUROPE {
	@Override
	String getRegionAsString() {
		// TODO Auto-generated method stub
		return "Europe";
	}
}, OUTSIDE_EUROPE {
	@Override
	String getRegionAsString() {
		// TODO Auto-generated method stub
		return "Outside Europe";
	}
};
	
	abstract String getRegionAsString();
}
