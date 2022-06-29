package d0502;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("\n--------------------");
		f1();
		System.out.println("\n--------------------");
		f2();
		System.out.println("\n--------------------");
		f3();
	}

	private static void f1() {
		/*
		 * 先新建 String[]，长度5
		 * 再把数组地址保存到变量a
		 * a = [null, null, null, "abc", null]
		 *                         3
		 * 在下标3位置放入 "abc"
		 */
		String[] a = new String[5];
		//Arrays.toString(a)
		//把数组中的数据，连接成字符串
		System.out.println(Arrays.toString(a));
		a[3] = "abc";
		System.out.println(Arrays.toString(a));
	}

	private static void f2() {
		int[] a = {6,2,7,3,7,3,1,5};
		System.out.println(Arrays.toString(a));
		a = new int[]{7,2,9,3};
		System.out.println(Arrays.toString(a));
	}

	private static void f3() {
		int[] a = new int[5];
		a[2] = 565;
		System.out.println(a[2]);
		System.out.println(a[2] * 2);
		a[2]++;		
		/* 交换 2,3 位置的值
		 * [0, 0, 0, 0, 0]
		 *         2   3
		 * t = 566 */
		int t = a[2];
		a[2] = a[3];
		a[3] = t;
		System.out.println(Arrays.toString(a));
	}
}









