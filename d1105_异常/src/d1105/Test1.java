package d1105;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
		while(true) {
			try {
				f();
				break;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("输入两个！");
				e.printStackTrace();
			} catch (ArithmeticException e) {
				System.out.println("不能除0！");
				e.printStackTrace();
			} catch (Exception e) {
				System.out.println("出错，请重试");
			} finally {
				System.out.println("\n------------------------");
			}
		}
		
		
	}

	private static void f() {
		/*
		 * "5235,45" --> ["5235", "45"]
		 *                  0       1
		 * 
		 * 5235 / 45
		 */
		System.out.println("输入逗号隔开的两个整数");
		String s = new Scanner(System.in).nextLine();
		String[] a = s.split(",");
		int n1 = Integer.parseInt(a[0]);
		int n2 = Integer.parseInt(a[1]);
		int r = n1 / n2;
		System.out.println(r);
		/*
		 * 3453,33       345     abc,def    345,0
		 */
	}
}








