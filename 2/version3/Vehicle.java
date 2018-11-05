package version3;

public class Vehicle {
	
	public double load = 0;
	public double mxLoad = 98000;
	
	public void mxLoad() {
		
	}
	
	public double getLoad() {
		return newtsToKilo(load);
		
	}
	
	public double getMaxLoad() {
		return newtsToKilo(mxLoad);
		
	}
	
	public boolean addBox(double weight){
		load = load + kiloToNewts(weight);
		if(load <= mxLoad)
			return true;
		else {
			load = load - kiloToNewts(weight);
			return false;
		}
	}
	
	 @SuppressWarnings("unused")
	private double kiloToNewts(double weight) {
		 return (weight * 9.8);
	}
	@SuppressWarnings("unused")
	private double newtsToKilo(double weight) {
		return (weight / 9.8);
	}
}
