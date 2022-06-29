package d0602;

import java.util.Random;

public class Weapon {
	String name;// 武器名称
	int bullets;// 子弹数量
	public Weapon(String name) {
		this(name, 100);//构造方法之间调用
	}
	public Weapon(String name, int bullets) {
		this.name = name;
		this.bullets = bullets;
	}

	public void fire() {
		System.out.println(name+"开火");
		//产生随机的发射子弹数量
		int r = 3 + new Random().nextInt(10);
		if(r > this.bullets) {
			r = this.bullets;
		}
		this.bullets -= r;
		for (int i = 0; i < r; i++) {
			System.out.print("突");
		}
		System.out.println("~");
		System.out.println("剩余子弹："+bullets);
	}	
	
	public void reload() {
		this.bullets = 100;
	}
}









