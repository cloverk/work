package demo01;

public class Computer implements ComputeWeigh{
	private double weight;
	Computer(double c){
		this.weight = c;
	}
	public double computeWeight(){
		return weight;
	}
}
