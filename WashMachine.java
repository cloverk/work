package demo01;

public class WashMachine implements ComputeWeigh{
	private double weight;
	WashMachine(double w){
		this.weight = w;
	}
	public double computeWeight(){
		return weight;
	}
}
