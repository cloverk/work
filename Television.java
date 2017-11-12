package demo01;

public class Television implements ComputeWeigh{
	private double weight;
	Television(double t){
		this.weight = t;
	}
	public double computeWeight(){
		return weight;
	}
}
