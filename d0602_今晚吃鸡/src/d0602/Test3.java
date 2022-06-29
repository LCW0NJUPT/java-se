package d0602;

import java.util.Scanner;

/*
 * 100个士兵进入刺激战场
 * 
 * Soldier[] 数组
 * [
 *     {
 *         id: 1,
 *         blood: 100,
 *         weapon: {...}
 *     },
 *     {
 *         id: 2,
 *         blood: 100,
 *         weapon: {...}
 *     }
 *     ....
 * ]
 */
public class Test3 {
	public static void main(String[] args) {
		System.out.println("欢迎进入刺激战场");
		//100个士兵，每个士兵拿一把枪
		Soldier[] a = new Soldier[100];
		for (int i = 0; i < a.length; i++) {
			//新建士兵实例，为id和weapon赋值
			Soldier s = new Soldier();
			s.id = i+1;
			s.weapon = new Weapon("AK"+(i+1));
			//把士兵放入数组
			a[i] = s;
		}
		System.out.println("按回车执行");
		while(true) {
			//暂停等待，按回车后才会继续向后执行
			new Scanner(System.in).nextLine();
			//每个士兵进攻一轮
			for (int i = 0; i < a.length; i++) {
				if (a[i].blood != 0) {//如果有血
					a[i].attack();    //执行进攻
					System.out.println("----");
				}
			}
			System.out.println("\n\n---------------------");
		}
	}
}









