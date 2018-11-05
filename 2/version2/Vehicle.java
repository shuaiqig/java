package version2;

public class Vehicle {
	private double load = 0;
	private double mxLoad = 10000;

	public boolean addBox(double weight){
		load = load + weight;
		if(load <= mxLoad)
			return true;
		else {
			load = load - weight;
			return false;
		}
	}
	
	public void mxLoad() {
		
	}
	
	public double getLoad() {
		return load;
		
	}
	
	public double getMaxLoad() {
		return mxLoad;
		
	}
}
