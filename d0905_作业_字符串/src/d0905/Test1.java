package d0905;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("email:");
		String e = new Scanner(System.in).nextLine();
		String name = getName(e);
		System.out.println(name);
		
		System.out.println("对称：");
		String s = new Scanner(System.in).nextLine();
		if (duiChen(s)) {
			System.out.println("对称");
		} else {
			System.out.println("不对称");
		}
	}

	private static String getName(String e) {
		/*
		 * "abc@def.com"
		 *     |
		 */
		int index = e.indexOf("@");
		if (index == -1) {
			return "格式错误";
		}
		
		return e.substring(0, index);
	}

	private static boolean duiChen(String s) {
		/*
		 *        j
		 * abcdedcba
		 *  i
		 */
		for (int i = 0,j=s.length()-1; i<j; i++,j--) {
			//i和j位置字符不相等
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}




