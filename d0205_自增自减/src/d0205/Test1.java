package d0205;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * 添加断点
		 * f11 启动调试，在断点位置暂停
		 * f6 单步执行
		 */
		int a = 6;
		System.out.println(a++);//先取值6，打印取出的6
		System.out.println(a);
		System.out.println("\n-----------------");
		a = 6;
		System.out.println(++a);//后取值7，打印取出的7
		System.out.println(a);
		System.out.println("\n------------------");
		a = 6;
		int b = a++;//先取值6，再自增成7，把取出的6赋给b
		System.out.println(a);
		System.out.println(b);
		System.out.println("\n------------------");
		a = 6;
		a = a++;//先取值6，再自增成7，把取出的6赋给a
		System.out.println(a);
		
		System.out.println("\n------------------");
		a = 6;
		a++;
		System.out.println(a);
		
		System.out.println("\n--再写变量交换----------------");
		a = 3;
		b = 4;
		//交换
		int t = a;
		a = b;
		b = t;
		//打印
		System.out.println(a);
		System.out.println(b);
	}
}



