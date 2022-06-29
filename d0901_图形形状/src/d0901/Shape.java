package d0901;

public abstract class Shape {
	/*
	 *父类中无法完成，需要子类各自编写各自的代码，可以使用抽象类
	 * *) 作为通用方法
	 * *) 子类必须实现
	 * 构造方法不被继承，只被调用（隐含调用）
	 */
	public abstract void draw();
	
	
	public void clear() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("图形已被擦除");
		System.out.println("---------------------------");
	}
}