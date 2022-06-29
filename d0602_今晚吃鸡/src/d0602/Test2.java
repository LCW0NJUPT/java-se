package d0602;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		//新建两个武器实例，
		//调用发射方法、装载方法测试
		Weapon w1 = new Weapon("AKM");
		Weapon w2 = new Weapon("M416", 80);
		
		System.out.println("回车发射，输入r装载子弹");
		while(true) {
			String s = new Scanner(System.in).nextLine();
			if (s.equals("r")) {
				w1.reload();
				w2.reload();
				System.out.println("弹夹已装满");
				continue;
			}
			w1.fire();
			w2.fire();
		}
		
	}
}







