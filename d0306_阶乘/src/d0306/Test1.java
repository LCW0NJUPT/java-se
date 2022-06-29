package d0306;

import java.math.BigInteger;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入整数，求阶乘：");
		int n = new Scanner(System.in).nextInt();
		//把n变量的值取出来，传递到f()方法
		String r = f(n);
		System.out.println(r);
	}

	/*
	 * r = n
	 * 
	 * i
	 * n-1, r=r*i
	 * 3, r=r*i
	 * 2, r=r*i
	 * 1, r=r*i
	 */
	private static String f(int n) {
		/*//如果参数n的值是0，直接返回1
		if(n == 0) {
			return 1;
		}
		long r = n;
		//i循环从n-1到1
		for (int i = n-1; i >= 1; i--) {
			r=r*i;
		}
		//向调用位置返回计算结果
		return r;*/
		
		if(n == 0) {
			return "1";
		}
		
		BigInteger r = BigInteger.valueOf(n);
		for (int i = n-1; i >= 1; i--) {
			r = r.multiply(BigInteger.valueOf(i));       
		}
		return r.toString();
	}
}





