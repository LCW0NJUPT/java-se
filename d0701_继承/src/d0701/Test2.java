package d0701;

public class Test2 {
	public static void main(String[] args) {
		//默认执行 Person()
		Student s1 = new Student();
		//默认执行 Person()
		Student s2 = new Student("a","b",0,"c");   
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}
