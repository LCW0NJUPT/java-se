package d1402;

public class Test2 {
	public static void main(String[] args) {
		// 得到的是 Weapon 的子类实例
		Weapon w1 = f1();
		w1.kill();
		System.out.println(w1);
		
		System.out.println("--------------------");
		
		Weapon w2 = f2("方天画戟");
		w2.kill();
		System.out.println(w2);
	}
	
	private static Weapon f2(String name) {
		/*
		 * 局部内部类中，使用外面的局部变量，
		 * 必须加 final，jdk1.8，缺省
		 */
		Weapon w = new Weapon() { 
			//编译器添加的隐含代码
			//final String name = 外面的name;
			
			@Override
			public void kill() {
				System.out.println(
				 "使用"+name+"进攻");
			}
		};

		
		return w;
	}

	private static Weapon f1() {
		class AK47 implements Weapon {
			@Override
			public void kill() {
				System.out.println(
				 "使用AK47进攻");
			}
		}		
		AK47 a = new AK47();
		return a;
	}
}






