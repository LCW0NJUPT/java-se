package d1405;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Test2 {
	public static void main(String[] args) throws Exception {
		/*
		 * f6   GBK
		 * f7   UTF-8
		 * 
		 * 把Unicode编码所有的中文字符，输出到两个文件
		 * \u4e00到\u9fa5，20902个中文
		 */
		f("d:/abc/f6", "GBK");
		f("d:/abc/f7", "UTF-8");
	}

	private static void f(
			String path, String charset) throws Exception {
		/*
		 * OSW--FOS--path
		 */
		OutputStreamWriter out = 
		 new OutputStreamWriter(
		 new FileOutputStream(path), charset);		
		int count=0;
		for (char i = '\u4e00'; i <= '\u9fa5'; i++) {
			out.write(i);
			count++;
			if(count == 30) {
				out.write('\n');
				count=0;
			}
		}		
		out.close();
	}
}






