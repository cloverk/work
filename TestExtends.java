package work;

public class TestExtends {
	public static void main(String[] args) {
		Student student = new Student("����",18,"����");
		student.show();
		Undergraduate student1 = new Undergraduate("����",20,"����","�������");
		student1.show();
		Graduate student2 = new Graduate("����",25,"˶ʿ","���");
		student2.show();
	}
}
