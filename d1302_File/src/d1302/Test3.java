package d1302;

import java.io.File;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("文件夹：");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);
		if (! dir.isDirectory()) {
			System.out.println("请输入正确的文件夹");
			return;
		}		
		/*
		 * 如果对文件进行列表、
		 * 对不存在的路径列表、
		 * 对无权访问的文件夹列表
		 * 都返回 null 值
		 */
		String[] names = dir.list();
		File[] files = dir.listFiles();
		if(names ==null) {
			System.out.println("无法获得目录列表");
			return;
		}
		for (int i = 0; i < names.length; i++) {
			// "a.txt"
			System.out.println(names[i]);
		}
		System.out.println("\n\n-------------------------");
		for (int i = 0; i < files.length; i++) {
			File f = files[i];
			System.out.println(
			 f.getName()+" - "+f.length());
		}
				
	}
}




