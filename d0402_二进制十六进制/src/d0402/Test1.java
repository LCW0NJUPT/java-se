package d0402;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		//死循环
		outer:
		while(true) {
			System.out.println(
			 "输入0b开头二进制，或0x开头十六进制，q退出");
			String s = new Scanner(System.in).nextLine();
			//字符串比较是否相等，不能用 == 
			//要用 equals() 方法
			if(s.equals("q")) {
				break;
			}
			
			//前缀不是0b，也不是0x
			if (! (s.startsWith("0b") || s.startsWith("0x"))) {
				System.out.println("前缀错误");
				continue;
			}		
			//字符串长度至少3
			if(s.length() < 3) {
				System.out.println("格式错误");
				continue;
			}
			
			if(s.startsWith("0b")) {
				// 0b10x0111101
				for (int i = 2; i < s.length(); i++) {
					char c = s.charAt(i);
					if (! (c=='1' || c=='0')) {
						System.out.println("二进制格式错误");
						continue outer;
					}
				}
			}			
			if(s.startsWith("0x")) {
				// 0x9af9ce
				for (int i = 2; i < s.length(); i++) {
					char c = s.charAt(i);
					if (! ((c>='0' && c<='9') || (c>='a'&&c<='f'))) {
						System.out.println("十六进制格式错误");
						continue outer;
					}
				}
			}
			
			//把s传递到 f() 方法，转成10进制整数
			int r = f(s);
			System.out.println("10进制："+r);
			System.out.println("\n---------------------");
		}
	}

	private static int f(String s) {
		/*
		 * 参数字符串 s
		 * "0B1101011"
		 * "0xf9aac5e" --> "f9aac5e"
		 * 如果是大写，先变成小写
		 * s.toLowerCase()
		 * 
		 * 获取0b或0x后面的数字部分
		 * s.substring(2)
		 * 
		 * 判断前缀是0b还是0x
		 * s.startsWith("0b")
		 * 
		 * 转成10进制
		 * Integer.parseInt("1101011", 2)
		 * Integer.parseInt("f9aac5e", 16)
		 */
		//转成小写 "0B1101" --> "0b1101"
		s = s.toLowerCase();
		//截取0b、0x后面的数字部分 "0b1101"--> "1101"
		String n = s.substring(2);
		//准备一个保存结果的变量 r
		int r = 0;
		//判断前缀是0b还是0x
		if (s.startsWith("0b")) {
			r = Integer.parseInt(n, 2);//"1101"-->13
		} else if (s.startsWith("0x")) {
			r = Integer.parseInt(n, 16);//"d" -->13
		}
		return r;
	}
}




