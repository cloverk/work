package work;

public class Student {
	protected String name;
	protected int age;
	protected String education;
	Student(String name,int age,String education){
		this.name = name;
		this.age = age;
		this.education = education;
	}
	public void show(){
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("education:"+education);
	}
}

class Undergraduate extends Student{
	String specialty;
	Undergraduate(String name, int age, String education,String specialty) {
		super(name, age, education);
		this.specialty = specialty;
	}
	public void show(){
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("education:"+education);
		System.out.println("specialty:"+specialty);
	}
}

class Graduate extends Student{
	String direction;
	Graduate(String name, int age, String education,String direction) {
		super(name, age, education);
		this.direction = direction;
	}
	public void show(){
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("education:"+education);
		System.out.println("direction:"+direction);
	}
}

