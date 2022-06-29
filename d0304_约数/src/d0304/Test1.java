package d0304;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入整数：");
		int n = new Scanner(System.in).nextInt();
		//把n变量的值取出来
		//把值传递到 f() 方法
		f(n);//ctrl+1，回车
	}

	private static void f(int n) {
		/*
		 * i循环从 1 到 n 
		 * 找 n 能被 i 整除的情况，打印 i 的值
		 */
		for (int i = 1; i <=n; i++) {
			if (n%i == 0) {
				System.out.println(i);
			}
		}
	}
}








