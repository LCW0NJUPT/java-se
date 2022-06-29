package d1002;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		/*
		 * 新建数组，并在数组中新建 Soldier 实例
		 * [{}, {}, {}]
		 * 
		 * 当有存活士兵，士兵数量!=0
		 * 让士兵进攻
		 */
		System.out.print("士兵数量：");
		int n = new Scanner(System.in).nextInt();
		Soldier[] a = new Soldier[n];
		//新建n个士兵实例存入数组
		for (int i = 0; i < a.length; i++) {
			a[i] = new Soldier();
			a[i].id = i+1;
		}
		System.out.println("按回车执行");
		//当有存活的士兵
		while(Soldier.count != 0) {
			new Scanner(System.in).nextLine();
			for (int i = 0; i < a.length; i++) {
				if (a[i].blood != 0) {//活着才执行进攻
					a[i].attack();
				}
			}
			System.out.println("存活士兵数量："+Soldier.count);      
			System.out.println("\n-----------------------");
		}
		
	}
}





