package d1401;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("原文件：");
		String s1 = new Scanner(System.in).nextLine();
		File from = new File(s1);
		if(! from.isFile()) {
			System.out.println("请输入正确的文件");
			return;
		}
		System.out.println("目标文件：");
		String s2 = new Scanner(System.in).nextLine();
		File to = new File(s2);
		if (to.isDirectory()) {
			System.out.println(
			 "请具体到文件，不能是文件夹");
			return;
		}
		
		System.out.print("KEY："); //0到255，超出255只有后面8位起作用
		int key = new Scanner(System.in).nextInt();
		
		
		try {
			copy(from, to, key);
			System.out.println("完成");
		} catch (Exception e) {
			System.out.println("失败");
			e.printStackTrace();
		}
	}

	private static void copy(
			File from, File to, int key) throws Exception {
		FileInputStream in = new FileInputStream(from);
		FileOutputStream out = new FileOutputStream(to);
		byte[] buff = new byte[8192];
		int n;
		while((n = in.read(buff)) != -1) {
			/* 先把buff数组中的前n个字节值加密
			 * 加密之后再向目标文件输出 */
			for (int i = 0; i < n; i++) {
				buff[i] ^= key;
			}
			out.write(buff, 0, n);
		}		
		in.close();
		out.close();
	}
}









