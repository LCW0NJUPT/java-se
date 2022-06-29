package d1201;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		f();
	}

	private static void f() {
		/*
		 * 输入两个浮点数：
		 * 234.23
		 * 0
		 * 
		 * 234.23 / 0  Infinity
		 */
		System.out.println("输入两个浮点数：");
		double a = new Scanner(System.in).nextDouble();
		double b = new Scanner(System.in).nextDouble();
		try {
			double c = divide(a, b);
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("不能除零，是我们的错，请鞭笞我们吧！");
			e.printStackTrace();
		}
	}
	private static double divide(double a, double b) {
		if (b == 0) {
			ArithmeticException e = 
			 new ArithmeticException("/ by zero");
			throw e;
		}
		return a/b;
	}
}








