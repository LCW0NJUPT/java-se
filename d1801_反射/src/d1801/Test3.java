package d1801;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) throws Exception {
		/*
		 * 反射新建两个实例
		 * 1. 无参构造
		 * 2. int参数构造
		 */
		System.out.println("输入类名：");
		String s = new Scanner(System.in).nextLine();
		Class<?> c = Class.forName(s);
		
		Object o1 = null;
		Object o2 = null;
		
		System.out.println("--执行无参构造------------");
		try {
			o1 = c.newInstance();
			System.out.println(o1);
		} catch (Exception e) {
			System.out.println("不能执行无参构造");
		}
		
		System.out.println("--执行有参构造------------");
		try {
			Constructor<?> t = c.getConstructor(int.class);
			o2 = t.newInstance(6);
			System.out.println(o2);
		} catch (Exception e) {
			System.out.println("不能执行int参数构造方法");
		}
	}
}





