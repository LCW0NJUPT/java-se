package d1405;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test1 {
	public static void main(String[] args) throws Exception {
		/*
		 * f4   61 d6 d0
		 * f5   61 e4 b8 ad
		 */
		f("d:/abc/f4", "GBK");
		f("d:/abc/f5", "UTF-8");
		
	}

	private static void f(
			String path, String charset) throws Exception {
		/*
		 * ISR--FIS--path, charset
		 * 
		 * InputStreamReader
		 * 读取其他编码，转成 Unicode 编码
		 */
		InputStreamReader in = 
		 new InputStreamReader(
		 new FileInputStream(path), charset);
		
		System.out.println((char)in.read());
		System.out.println((char)in.read());
		in.close();
	}
}





