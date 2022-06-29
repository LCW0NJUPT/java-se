package d1002;

import java.util.Random;

/*
 * 封装
 * 把士兵相关的数据、运算方法，封装成一个“类”
 */
public class Soldier {
	//成员变量、属性变量
	int id; //默认值0
	int blood = 100;
	
	//静态变量，士兵的数量
	//在方法区，类的内存空间中，只保存一份
	//可以在所有士兵实例之间共享的数据
	static int count;
	
	public Soldier() {
		//静态属于类，一般用类名调用
		Soldier.count++;
	}
	
	//成员方法
	public void go() {
		System.out.println(this.id+"号士兵前进");
	}
	
	public void attack() {
		if(this.blood == 0) {
			System.out.println("这是"+id+"号士兵的尸体");
			return;
		}
		System.out.println(this.id+"号士兵进攻");
		//模拟受到伤害，产生一个随机的减血量
		int d = new Random().nextInt(10);
		//如果减血量比当前血量大
		if(d > this.blood) {
			d = this.blood;//有多少减多少
		}
		this.blood -= d;
		System.out.println("血量："+this.blood);
		if(this.blood == 0) {
			System.out.println(id+"号士兵阵亡");
			Soldier.count--;
		}
	}
}




