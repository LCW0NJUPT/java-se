package d0303;

import java.util.Random;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("\n---------------------");
		f1();
		System.out.println("\n--打印正方形-------------------");
		f2();
		System.out.println("\n--打印三角形-------------------");
		f3();
		System.out.println("\n--又打印三角形-------------------");
		f4();
	}
	private static void f1() {
		for(int i=1; i<=3; i++) {
			for(char j='a'; j<='c'; j++) {
				System.out.println(i+", "+j);
			}
		}
	}
	private static void f2() {
		/*
		 *  i
		 *  1 *****
		 *  2 *****
		 *  3 *****
		 *  4 *****
		 *  n *****
		 *    1234n j
		 */
		//产生一个随机整数，作为行数，
		//范围 5+ [0, 50) --> [5, 55)
		int n = 5 + new Random().nextInt(50);
		System.out.println(n+"行正方形");
		//i循环从第1行到第n行
		for (int i = 1; i<=n; i++) {
			//j循环从第1个星号到第n个星号
			for (int j = 1; j<=n; j++) {
				System.out.print("*");
			}
			//行尾补一个换行
			System.out.println();
		}
		
		
	}
	private static void f3() {
		/*
		 *   i
		 *   1  *
		 *   2  **
		 *   3  ***
		 *   4  ****
		 *   n  *****
		 *      1234i j
		 */
		int n = 5 + new Random().nextInt(50);
		System.out.println(n+"行三角形");
		/*
		 * i循环从第1行到第n行
		 *     j循环从第1个星号到第i个星号
		 */
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void f4() {
		/*
		 *  i
		 *  1       *
		 *  2      ***
		 *  3     *****
		 *  4    *******
		 *  n   *********
		 *  
		 *  空格数量从第1个空格到第n-i个空格
		 *  星号数量从第1个星号到第2i-1个星号
		 */
		int n = 5 + new Random().nextInt(50);
		System.out.println(n+"行三角形");
		//i循环1到n行
		for (int i = 1; i <=n; i++) {
			//j循环1到n-i个空格
			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
			}
			//j循环1到2i-1个星号
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			//补换行
			System.out.println();
		}
		
	}
}







