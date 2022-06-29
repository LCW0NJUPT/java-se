package d0206;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入整数a：");
		int a = new Scanner(System.in).nextInt(); 
		System.out.print("输入整数b：");
		int b = new Scanner(System.in).nextInt(); 
		System.out.print("输入整数c：");
		int c = new Scanner(System.in).nextInt(); 
		
		//取 a,b 的最大值，存到变量 max
		//取 max,c 的最大值，再存到变量 max
		
		//int max = a>b ? a : b;
		//max = max>c ? max : c;
		
		//int max = a<b ? b : a;
		//max = max<c ? c : max;
		
		int max = a>b ? (a>c?a:c) : (b>c?b:c);
		
		System.out.println("最大值："+max);
		
		System.out.println("\n--再写变量交换------------");
		// max 和 c 交换，交换后打印
		int t = max;
		max = c;
		c = t;
		System.out.println("max = "+max);
		System.out.println("c = "+c);
	}
}





