package d0602;

import java.util.Random;

/*
 * 封装
 * 把士兵相关的数据、运算方法，封装成一个“类”
 */
public class Soldier {
	//成员变量、属性变量
	int id; //默认值0
	int blood = 100;
	Weapon weapon; // 默认值 null
	
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
		//如果有枪
		if (this.weapon != null) {
			if (this.weapon.bullets == 0) {
				this.weapon.reload();//装载子弹
			}
			this.weapon.fire(); //开火
		}
		
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
		}
	}
}




