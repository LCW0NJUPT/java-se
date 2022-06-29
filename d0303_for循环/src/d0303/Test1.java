package d0303;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("\n--1到10---------------");
		f1();
		System.out.println("\n--10到1---------------");
		f2();
		System.out.println("\n--2,4,6,8,10---------------");
		f3();
		System.out.println("\n--8,88,888....888888888---------------");
		f4();
		System.out.println("\n-----------------");
		//f5();
	}//双击大括号

	static void f1() {
		int i = 1;
		for ( ;i <= 10;i++) {
			System.out.println(i);
		}
		System.out.println("-------------");
		System.out.println(i);
	}
	static void f2() {
		for (int i = 10;i >= 1;i--) {
			System.out.println(i);
		}
	}
	static void f3() {
		for (int i = 2;i <= 10;i+=2) {
			System.out.println(i);
		}
	}
	static void f4() {
		for (long i = 8;i <= 888888888;i=i*10+8) {
			System.out.println(i);
		}
	}
	static void f5() {
		//死循环，无限循环，打印1,2,3.....
		for(int i=1; ;i++) {
			System.out.println(i);
		}
	}

}





