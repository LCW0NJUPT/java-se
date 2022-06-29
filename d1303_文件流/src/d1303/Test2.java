package d1303;

import java.io.FileInputStream;

public class Test2 {
	public static void main(String[] args) throws Exception {
		/*
		 * FIS--f2
		 */
		FileInputStream in = 
		 new FileInputStream("d:/abc/f2");

		/*
		in.read()  ---- 61 ----> 00 00 00 61
		in.read()  ---- 62 ----> 00 00 00 62
		...
		为什么补三个0字节变成int，而不是直接返回单字节的byte?
			read()方法需要用一个-1特殊值来表示结束
			如果用单字节的byte，从文件读出的FF字节值，byte的类型是-1，就无法表示结束
		 */
		//标准格式
		int b;
		while((b = in.read()) != -1) {
			System.out.println(b);
		}
		in.close();

		/*int b;
		while(true) {
			b = in.read();
			if(b == -1) {
				break;
			}
			System.out.println(b);
		}*/
		
	}
}





