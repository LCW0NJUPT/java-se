package d0701;

public class Test1 {
	public static void main(String[] args) {
		
		/*
		 * p = {
		 *     name:"张三",
		 *     gender:"男",
		 *     age:22
		 * }
		 * 
		 * s = {
		 *     name:"李四",
		 *     gender:"女",
		 *     age:21,
		 *     
		 *     school:"牛蹄筋大学"
		 * }
		 * e = {
		 *     name:"王五",
		 *     gender:"男",
		 *     age:20,
		 *     
		 *     salary: 9000
		 * }
		 * 
		 */
		
		Person p = new Person("张三","男",22);
		Student s = new Student();
		Employee e = new Employee();
		
		
		s.name = "李四";
		s.gender = "女";
		s.age = 21;
		s.school = "牛蹄筋大学";
		
		e.name = "王五";
		e.gender = "男";
		e.age = 20;
		e.salary = 9000;
		
		//println()打印方法中，
		//默认调用了对象的 toString() 方法
		System.out.println(p.toString());
		System.out.println(s.toString());
		System.out.println(e.toString());
	}
}






