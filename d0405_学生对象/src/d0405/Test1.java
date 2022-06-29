package d0405;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("录入学生信息：");
		
		/*
		 * 
		 * Student 类, 学生的对象模板
		 * {
		 *     int id,
		 *     String name,
		 *     String gender,
		 *     int age,
		 *     print()  //模板方法
		 * }
		 * 
		 * 新建 Student 实例，存到变量 s1		 * 
		 * s1 = {
		 *     id: 6,
		 *     name: "张三",
		 *     gender: "男",
		 *     age: 21
		 * }
		 * 
		 */
		Student s1 = new Student();
		
		System.out.print("学号：");
		s1.id = new Scanner(System.in).nextInt();
		System.out.print("姓名：");
		s1.name = new Scanner(System.in).nextLine();
		System.out.print("性别：");
		s1.gender = new Scanner(System.in).nextLine();
		System.out.print("年龄：");
		s1.age = new Scanner(System.in).nextInt();
		
		//把录入的学生数据，传递到 f() 方法处理
		f(s1);
	}

	private static void f(Student s1) {
		/*
		 * s1 = {
		 *     id: xxx,
		 *     name: "xxx",
		 *     gender: "xxx",
		 *     age: xx
		 * }
		 */
		s1.print(); //让学生实例s1，执行print()方法
	}
}








