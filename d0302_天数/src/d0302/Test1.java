package d0302;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("年：");
		int y = new Scanner(System.in).nextInt();
		System.out.print("月：");
		int m = new Scanner(System.in).nextInt();
		// 调用 f() 方法，把 y 和 m 的值传递到f()方法
		f(y, m);
		System.out.println("---------------");
	}// 双击大括号，找到main结束

	static void f(int y, int m) {
		/*
		 * 1,3,5,7,8,10,12 -- 31 4,6,9,11 -- 30 2 -- 平年28，闰年29
		 */
		// 月是错误的值
		if (m < 1 || m > 12) {
			System.out.println("月份值输入错误");
			// 返回，控制程序执行的流程，
			// 返回到调用位置，继续执行
			return;// 方法执行到此结束，后面代码不再执行
		}
		// 定义天数变量 day
		// 初始值0，后面根据判断，要修改day的值
		int day = 0;
		// 判断月份值
		switch (m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
				day = 29;
			} else {
				day = 28;
			}
		}

		System.out.println(y + "年" + m + "月的天数：" + day);

	}

}
