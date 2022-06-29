package d1404;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) throws Exception {
		String s = "abc中文";
		System.out.println(s);
		f(s, "UTF-16Be");
		f(s, null);
		f(s, "GBK");
		f(s, "UTF-8");
	}

	/*
	 * encoding		编码
	 * charset		字符集
	 * 
	 * a 中
	 * Unicode		00 61    4e 2d
	 * UTF-8		61		 e4 b8 ad
	 * GBK			61		 d6 d0
	 */
	private static void f(
			String s, String charset) throws Exception {
		byte[] a;
		if (charset == null) {
			//Unicode ---> 系统默认编码
			a = s.getBytes();
		} else {
			//Unicode ---> 指定的编码
			a = s.getBytes(charset);
		}
		System.out.println(
		 charset+"\t"+Arrays.toString(a));
		// 转回Unicode字符
		if (charset == null) {
			//从系统默认编码转回Unicode
			s = new String(a);
		} else {
			//从指定编码转回Unicode
			s = new String(a, charset);
		}
		System.out.println(s);
		System.out.println("-------------------");
		
	}
}





