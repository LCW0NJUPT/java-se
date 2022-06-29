package d0408;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("整数a:");
		int a = new Scanner(System.in).nextInt();
		System.out.print("整数b:");
		int b = new Scanner(System.in).nextInt();
		
		//把a,b的值传递到 zdgys() 求最大公约数
		int y = zdgys(a, b);
		//把a,b的值传递到 zxgbs() 求最小公倍数
		long s = zxgbs(a, b);
		System.out.println("最大公约数："+y);
		System.out.println("最小公倍数："+s);
	}

	private static int zdgys(int a, int b) {
		int min = a<b ? a : b;
		for (int i = min; i >= 1; i--) {
			//a,b都能被 i 整除
			if(a%i==0 && b%i==0) {
				return i;
			}
		}
		return 1;//不可能执行，为了编译通过
	}

	private static long zxgbs(int a, int b) {
		int max = a>b ? a : b;
		for (int i = max; ;i += max) {
			//i能被a和b整除
			if(i%a==0 && i%b==0) {
				return i;
			}
		}
	}
}







