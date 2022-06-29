package d0201;

import java.util.Scanner;

/*
 * window->preference->java->editor->
 * content assist->auto activation
 * 
 * tiggers 添加字符小写a到z，大写a到z，和下划线
 * .abcdefghijklmnopqrstuvwxyz_ABCDEFGHIJKLMNOPQRSTUVWXYZ
 * 
 * 避免干扰输入，可以设置提示的延迟时间 500
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入整数a：");
		//先获得输入的整数
		//再保存到变量 a
		int a = new Scanner(System.in).nextInt();

		System.out.print("输入整数b：");
		int b = new Scanner(System.in).nextInt();
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("--交换----------");
		//三句交换自己再写一遍
		//比别人多写一遍！！！！
		//下次再写变量交换能直接写出来，不写错！！！
		int t = a;
		a = b;
		b = t;
		
	    System.out.println("a = "+a);
	    System.out.println("b = "+b);
	}
}











