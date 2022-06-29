package d1303;

import java.io.FileInputStream;
import java.util.Arrays;

public class Test3 {
	public static void main(String[] args) throws Exception {
		/*
		 * FIS--f2
		 */
		FileInputStream in = 
		 new FileInputStream("d:/abc/f2");
		//批量读取标准格式，写了删，删了写
		byte[] buff = new byte[5];  //习惯用8192
		int n;//用来保存每次读取的数量
		while((n = in.read(buff)) != -1) {
			System.out.println(
			 n+"个："+Arrays.toString(buff));
		}
		in.close();
		
		
		
		/*while(true) {
			n = in.read(buff);
			if (n == -1) {
				break;
			}
			System.out.println(
			 n+"个："+Arrays.toString(buff));
		}*/
		
		
	}
}






