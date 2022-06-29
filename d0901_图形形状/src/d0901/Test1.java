package d0901;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * Shape s = null;
		 * 
		 * s = Shape实例
		 * s = Line实例
		 * s = Square实例
		 * s = Circle实例
		 */
		
		System.out.println("按回车执行");
		Shape s = null;
		
		while(true) {
			new Scanner(System.in).nextLine();     
			int r = new Random().nextInt(4);
			switch(r) {
			case 0: 
				System.out.println("Shape抽象类，不能创建实例");
				continue;
			case 1: s = new Line(); break;
			case 2: s = new Square(); break;
			case 3: s = new Circle(); break;
			}
			
			f(s);
		}
	}

	/*
	 * Shape
	 *   |- Line， length()
	 *   |- Square
	 *   |- Circle 
	 */
	private static void f(Shape s) {
		System.out.println("---当做Shape父类型处理----------------");
		//获得真实类型的类名,
		//模仿Object中toString()方法的代码
		String n = s.getClass().getName();
		System.out.println("真实类型："+n);
		
		s.draw();
		//当做父类型，只能调用父类定义的通用成员，
		//子类特有成员被隐藏
		//s.length();
		
		//s引用的实例，真实类型是Line
		if (s instanceof Line) {
			System.out.println(
			 "向下转回成 Line 类型,再调用长度方法");
			Line line = (Line) s;
			line.length();
		}
		
		new Scanner(System.in).nextLine();
		s.clear();
	}
}






