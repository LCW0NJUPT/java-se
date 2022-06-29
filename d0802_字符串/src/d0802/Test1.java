package d0802;

public class Test1 {
	public static void main(String[] args) {
		char[] a = {'a', 'b', 'c', 'd'};
		String s1 = new String(a);//新分配内存
		String s2 = "abcd";//在常量池新分配内存
		String s3 = "abcd";//访问常量池存在的对象
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1 == s2);//false，地址不同
		System.out.println(s2 == s3);//true，地址相同
		/*
		 * equals()比较什么，
		 * 进入equals()方法看里面的代码在比较什么
		 */
		System.out.println(s1.equals(s2));
	}
}
