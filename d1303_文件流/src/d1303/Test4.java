package d1303;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test4 {
	/*
	 * 原文件：d:/abc/f2
	 * 目标文件： d:/def/f3
	 */
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
		try {
			copy(from, to);
			System.out.println("完成");
		} catch (Exception e) {
			System.out.println("失败");
			e.printStackTrace();
		}
	}

	private static void copy(
			File from, File to) throws Exception {
		/*
		 * 文件输入流插在 from
		 * 文件输出流插在 to
		 * 从头到尾读取 from 原文件数据，
		 * 读取的数据，直接向目标文件 to 输出
		 */
		FileInputStream in = 
		 new FileInputStream(from);
		FileOutputStream out = 
		 new FileOutputStream(to);
		
		/*int b;
		while((b = in.read()) != -1) {
			out.write(b);
		}*/
		
		// 8k - 8192
		byte[] buff = new byte[8192];
		int n;//保存每一批的数量
		while((n = in.read(buff)) != -1) {
			System.out.println(n);
			out.write(buff, 0, n);
		}
		
		in.close();
		out.close();
	}
}






