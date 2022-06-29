package d0207;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * 添加断点
		 * f11 启动调试
		 * f6 单步执行
		 * f5 进入方法
		 */
		System.out.println(1);
		f();
		System.out.println(2);
		f();
		System.out.println(3);
		f();
	}//main方法结束
	
	static void f() {
		System.out.println(4);
	}
	
}




