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
		//С������װ3����Ʒ
		for(int i=0;i<3;i++){
			weight1 += a[i].computeWeight();
		}
		System.out.println("С����������:"+weight1+"kg");
		//�������װ5����Ʒ
		for(int i=0;i<5;i++){
			int c=0;
			if(c>3)
				c=c%3;
			weight2 += a[c].computeWeight();
			c++;
		}
		System.out.println("�����������:"+weight2+"kg");
		weight = weight1 +weight2;
		System.out.println("������:"+weight+"kg");
	}
}
