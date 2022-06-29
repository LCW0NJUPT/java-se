package d0204;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/*
			闰年的条件：
			*) 能被4整除，并且不能被100整除
			*) 能被400整除
			
			2000 闰年
			1000 平年
			2016 闰年
			2019 平年
		 */
		System.out.print("输入年号：");
		int y = new Scanner(System.in).nextInt();   
		//定义一个字符串变量 r="平年"
		//后面如果判断 y 是闰年，把 r 修改成 "闰年"
		String r = "平年";
		
		//y能被4整除并且不能被100整除，
		//或者，y能被400整除
		if((y%4==0 && y%100!=0) || y%400==0) {
			r = "闰年";
		}
		
		System.out.println(y+"年是"+r);
	}
}


