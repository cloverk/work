package demo01;

public class Car {
	ComputeWeigh[] a;
	Car(ComputeWeigh[] a){
		this.a = a;
	}
	public static void main(String[] args){
		ComputeWeigh[] a = new ComputeWeigh[3];
		a[0] = new Television(310.4);
		a[1] = new Computer(298.5);
		a[2] = new WashMachine(300);
		double weight = 0;
		double weight1 = 0;
		double weight2 = 0;
		//小货车能装3件物品
		for(int i=0;i<3;i++){
			weight1 += a[i].computeWeight();
		}
		System.out.println("小货车总质量:"+weight1+"kg");
		//大货车能装5件物品
		for(int i=0;i<5;i++){
			int c=0;
			if(c>3)
				c=c%3;
			weight2 += a[c].computeWeight();
			c++;
		}
		System.out.println("大货车总质量:"+weight2+"kg");
		weight = weight1 +weight2;
		System.out.println("总质量:"+weight+"kg");
	}
}
