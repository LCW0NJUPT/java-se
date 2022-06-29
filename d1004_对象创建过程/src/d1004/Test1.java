package d1004;
// 公共类类名，必须是文件名
public class Test1 {
	public static void main(String[] args) {
		new B();
		System.out.println("-----------");
		new B();
	}
}

class A {
	int v1 = 1;
	static int v2 = 2;
	static {
		System.out.println("A静态块");
	}
	A() {
		System.out.println("A构造");
	}
}
class B extends A {
	int v3 = 3;
	static int v4 = 4;
	static {
		System.out.println("B静态块");
	}
	B() {
		System.out.println("B构造");
	}
}
