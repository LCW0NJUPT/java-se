package d1601;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("原文件夹：");
		String s1 = new Scanner(System.in).nextLine();
		File from = new File(s1);
		if (! from.isDirectory()) {
			System.out.println("请输入正确的文件夹");
			return;
		}
		System.out.println("目标文件夹：");
		String s2 = new Scanner(System.in).nextLine();
		File to = new File(s2);
		if (to.exists()) {//如果已经存在
			System.out.println("目标已经存在，不能复制");
			return;
		}
		System.out.println("key: ");
		int key = new Scanner(System.in).nextInt();
		try {
			encryptCopyDir(from, to, key);
			System.out.println("完成");
		} catch (Exception e) {
			System.out.println("失败");
			e.printStackTrace();
		}
	}

	private static void encryptCopyDir(
			File from, File to, int key) throws Exception {
		if(! to.mkdirs()) {//新建文件夹，如果失败抛异常
			throw new FileNotFoundException(
				"路径不存在: "+to.getAbsolutePath());
		}		
		File[] list = from.listFiles();
		if(list == null) {
			return;
		}		
		for (File f : list) {
			//目标文件夹 to 中的目标文件，保持原文件名
			File toFile = new File(to, f.getName());
			if(f.isFile()) {//f是文件
				//加密复制单个文件
				encrypCopyFile(f, toFile, key);
			} else {//f是文件夹
				//递归复制子目录
				encryptCopyDir(f, toFile, key);
			}
		}
		
	}
	private static void encrypCopyFile(
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









