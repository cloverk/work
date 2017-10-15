package work;

public class TestExtends {
	public static void main(String[] args) {
		Student student = new Student("张三",18,"高中");
		student.show();
		Undergraduate student1 = new Undergraduate("李四",20,"本科","软件工程");
		student1.show();
		Graduate student2 = new Graduate("王五",25,"硕士","软件");
		student2.show();
	}
}
