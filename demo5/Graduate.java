package demo02;

public class Graduate implements StudentManageInterface,TeacherManageInterface{
	
	private String name;
	private String sex;
	private int age;
	private double fee;
	private double pay;
	
	Graduate(String n,String s,int a){
		this.name = n;
		this.sex = s;
		this.age = a;
	}

	@Override
	public void setPay(double p) {
		pay = p;
	}

	@Override
	public double getPay() {
		return pay;
	}

	@Override
	public void setFee(double f) {
		fee = f;
	}

	@Override
	public double getFee() {
		return fee;
	}
	
	public void b(){
		if((pay*12-fee)>=2000)
			System.out.println("sucess!");
		else
			System.out.println("provide a loan!");
	}
	
	public static void main(String[] args){
		Graduate graduate = new Graduate("ŐĹČý","ÄĐ",21);
		graduate.setFee(5500);
		graduate.setPay(750);
		graduate.b();
	}

}
