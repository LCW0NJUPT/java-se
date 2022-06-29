package d0703;

public abstract class Pet {
	String name;
	int full;
	int happy;
	public Pet(String name) {
		this(name, 50 ,50);
	}
	public Pet(String name, int full, int happy) {
		this.name = name;
		this.full = full;
		this.happy = happy;
	}
	public void feed() {
		if (full == 100) {
			System.out.println(name+"已经吃饱了");
			return;
		}
		System.out.println("给"+name+"喂食");
		full += 10;
		System.out.println("饱食度："+full);
	}
	public void play() {
		if (full == 0) {
			System.out.println(name+"饿得玩不动了");    
			return;
		}
		System.out.println("陪"+name+"玩耍");
		happy += 10;
		full -= 10;
		System.out.println("快乐度："+happy);
		System.out.println("饱食度："+full);
	}
	public void punish() {
		//不同的代码，就调用方法
		System.out.println(
		 "打"+name+"的pp，"+name+"哭叫："+cry());
		happy -= 10;
		System.out.println("快乐度："+happy);
	}
	
	/*
	 * 父类型，是一种泛化的类型，
	 * 有些子类不同代码，在父类中没法写，
	 * 可以选择定义成抽象方法
	 * 
	 * *) 作为通用方法在父类中定义
	 * *) 要求具体子类中，必须实现这个方法
	 */
	public abstract String cry();
}









