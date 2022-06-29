package d0208;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("\n-----------");
		f1();
		System.out.println("\n-----------");
		f2();
		System.out.println("\n-----------");
		f3();
	}//双击大括号，找main结束
	
	static void f1() {
		System.out.println(0b1); //1
		System.out.println(0b10); //逢二进位
		System.out.println(0b11); //3
		System.out.println(0b100);//进两位
		System.out.println(0b101);//5
		System.out.println(0b110);//逢二进位
		System.out.println(0b111);//7
		System.out.println(0b1000);//进3位
	}
	static void f2() {
		System.out.print("输入整数：");
		int a = new Scanner(System.in).nextInt();
		//整数用2进制显示出来
		//把整数变成一个2进制格式的字符串"1011101011"
		System.out.println(
			Integer.toBinaryString(a));
	}
	static void f3() {
		System.out.println(0b1); //1, 2的 0 次方
		System.out.println(0b10); //2, 2的 1 次方
		System.out.println(0b100); //4, 2的 2 次方
		System.out.println(0b1000); //8, 2的 3 次方
		System.out.println(0b10000); //16, 2的 4 次方
		System.out.println(0b100000); //32, 2的 5 次方
		System.out.println(0b1000000); //64, 2的 6 次方
		System.out.println(0b10000000); //128, 2的 7 次方
		System.out.println(0b100000000); //256, 2的 8 次方
		System.out.println(0b1000000000); //512, 2的 9 次方
		System.out.println(0b10000000000); //1024, 2的 10 次方
		System.out.println(0b100000000000); //2048, 2的 11 次方
		System.out.println(0b1000000000000); //4096, 2的 12 次方
		System.out.println(0b10000000000000); //8192, 2的 13 次方
		/*
		 * 1000个苹果，分装在几个箱子中，
		 * 不管客户要多少苹果，都可以整箱的交付
		 */
	}
	
}





