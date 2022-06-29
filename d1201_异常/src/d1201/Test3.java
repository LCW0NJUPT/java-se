package d1201;

import java.io.File;
import java.io.IOException;

public class Test3 {
	public static void main(String[] args) {
		f();
	}

	private static void f() {
		MyDate d = new MyDate();
		String s = d.toString();
		
		System.out.println(s);
		/*
		 * 在 d:\ 根目录，创建文件
		 * “2019-04-17 11:09:53.txt”
		 */
		s = s.replaceAll(":", ".");
		String path = "d:\\"+s+".txt";
		File f = new File(path);
		//不想加throws
		try {
			f.createNewFile();
		} catch (IOException e) {
			//也不想在此处修复处理异常，
			//希望把异常再抛到调用位置
			//包装成能抛出的异常再抛
			throw new RuntimeException(e);
		}



	}
}








