package d0404;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		//随机整数  1+ [0, 1000)
		//  1+  0,1,2,3,4....999
		int r = 1+ new Random().nextInt(1000);
		System.out.println(r);
		System.out.println("已经随机产生了一个[1, 1001) 范围的整数");
		System.out.println("请猜这个数是几");
		
		//定义变量 c, 保存每次猜的值
		int c;
		
		//先猜，再判断不相等，继续猜
		do {
			System.out.print("猜：");
			c = new Scanner(System.in).nextInt();
			if(c>r) {
				System.out.println("大");
			} else if(c<r) {
				System.out.println("小");
			}
		} while (c != r);
		
		System.out.println("对");
		
	}
}







