package d1302;

import java.io.File;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("文件夹：");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);
		if (! dir.isDirectory()) {
			System.out.println("请输入正确的文件夹");
			return;
		}
		
		long size = dirLength(dir);
		System.out.println(size);
	}

	private static long dirLength(File dir) {
		//对dir列表
		File[] list = dir.listFiles();
		if (list == null) {//不能获得列表
			return 0;
		}
		long sum = 0;
		for (File f : list) {
			if (f.isFile()) {//f是文件
				sum += f.length();
			} else {//f是文件夹
				sum += dirLength(f);//递归求f文件夹大小
			}
		}
		return sum;
	}
}



