package d1801;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws Exception {
		System.out.println("输入类名：");
		String s = new Scanner(System.in).nextLine();
		Class<?> c = Class.forName(s);
		
		System.out.println(c.getPackage().getName());
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		/*
		 * day1801.A
		 * java.lang.String
		 * java.util.ArrayList
		 * java.io.File
		 */
		
		System.out.println("\n--成员变量------------------");
		f1(c);
		System.out.println("\n--构造方法------------------");
		f2(c);
		System.out.println("\n--方法------------------");
		f3(c);
	}

	private static void f1(Class<?> c) {
		// private static final int v1;
		//Field实例，封装一个变量的定义信息
		Field[] a = c.getDeclaredFields();
		for (Field f : a) {
			String t = f.getType().getSimpleName();
			String n = f.getName();
			System.out.println(t+" "+n);
		}
		
	}

	private static void f2(Class<?> c) {
		//public A(int i, String s) throws ...
		//Constructor实例，封装构造方法的定义信息
		Constructor<?>[] a = 
			c.getDeclaredConstructors();
		for (Constructor<?> t : a) {
			String n = c.getSimpleName();
			Class<?>[] p = t.getParameterTypes();
			System.out.println(
			 n+"("+ Arrays.toString(p) +")");
		}
		
	}

	private static void f3(Class<?> c) {
		//public static String f1(int i) throws ...
		//Method实例，封装方法的定义信息
		Method[] a = c.getDeclaredMethods();
		for (Method t : a) {
			String n = t.getName();
			Class<?>[] p = t.getParameterTypes();
			System.out.println(
			 n+"("+ Arrays.toString(p) +")");
		}
		
	}
}








