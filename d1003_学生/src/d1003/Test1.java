package d1003;

public class Test1 {
	static {
		System.out.println("Test1 - 静态块");
	}
	
	public static void main(String[] args) {
		System.out.println("main");
		
		Student s = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		//s.id = 9527;
		s.setId(9527);
		s.setName("唐伯虎");
		s.setGender("男");
		s.setAge(19);
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getGender());
		System.out.println(s.getAge());

		System.out.println(Math.sqrt(-100));
	}
}
