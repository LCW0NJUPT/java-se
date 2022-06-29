package d0605;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("求第几个斐波那契数：");
		int n = new Scanner(System.in).nextInt();
		long r = g(n);
		System.out.println(r);
	}

	private static long g(int n) {
		/*
		 * 1 1 2 3 5 8
		 *         a b
		 * 
		 * b=a+b
		 * a=b-a
		 */
		long a = 1;
		long b = 1;
		//从第3个求到第n个
		for (int i = 3; i <= n; i++) {
			b=a+b;
			a=b-a;
		}
		return b;
	}

	//反例，多次递归，运算量大
	private static long f(int n) {
		//最简问题
		if (n==1 || n==2) {
			return 1;
		}
		return f(n-1) + f(n-2);
	}
}









