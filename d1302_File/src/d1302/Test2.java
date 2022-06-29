package d1302;

import java.io.File;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws Exception {
		/*
		 * d:/abc/aa/
		 * d:/abc/aa/f1
		 * 
		 * 删除f1
		 * 删除aa文件夹
		 */
		System.out.println("按回车执行");
		new Scanner(System.in).nextLine();
		File dir = new File("d:/abc/aa");
		dir.mkdirs();
		
		new Scanner(System.in).nextLine();
		File file = new File(dir, "f1");
		file.createNewFile();
		
		new Scanner(System.in).nextLine();
		file.delete();
		
		new Scanner(System.in).nextLine();
		dir.delete();
	}
}



