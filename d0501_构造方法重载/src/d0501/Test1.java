package d0501;

public class Test1 {
	/*
	 * Student类
	 * {
	 *     id,
	 *     name,
	 *     gender,
	 *     age,
	 *     toString()
	 * }
	 * 
	 * s1 = {
	 *     id: 0,
	 *     name: null,
	 *     gender: null,
	 *     age: 0
	 * }
	 * s2 = {
	 *     id: 6,
	 *     name: "张三",
	 *     gender: null,
	 *     age: 0
	 * }
	 * s3 = {
	 *     id: 6,
	 *     name: "张三",
	 *     gender: "男",
	 *     age: 0
	 * }
	 * s4 = {
	 *     id: 6,
	 *     name: "张三",
	 *     gender: "男",
	 *     age: 23
	 * }
	 */
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(6,"张三");
		Student s3 = new Student(6,"张三","男");
		Student s4 = new Student(6,"张三","男",23);  
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
	}
}






