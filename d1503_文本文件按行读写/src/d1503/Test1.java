package d1503;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Test1 {
	public static void main(String[] args) throws Exception {
		//读取 f8 文件，所有日期字符串存入集合
		List<String> list = f1();
		
		//对list中的日期字符串排序
		f2(list);
		
		//保存到 f9 文件
		f3(list);
	}

	private static List<String> f1() throws Exception {
		/*
		 * BR--ISR--FIS--f8
		 * 
		 * FIS -  插在文件上
		 * ISR -  处理编码转换
		 * BR  -  按行读取
		 */
		BufferedReader in = 
		 new BufferedReader(//处理换行，按行读取
		 new InputStreamReader(//编码转换流
	     new FileInputStream("d:/abc/f8"),"GBK"));
		
		ArrayList<String> list = new ArrayList<>();
		
		String line = null;
		while((line = in.readLine()) != null) {
			// trim() 去除两端的空白字符
			String s = line.trim();
			if (s.length() == 0) {
				continue;
			}
			list.add(s);
		}
		in.close();
		System.out.println(list);
		return list;
	}

	private static void f2(List<String> list) {
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				SimpleDateFormat f = 
				 new SimpleDateFormat("yyyy年MM月dd日");
				try {
					Date a = f.parse(o1);
					Date b = f.parse(o2);
					return a.compareTo(b);
				} catch (Exception e) {
					throw new IllegalArgumentException(e);
				}
			}
		});
		
		System.out.println(list);
		
	}

	private static void f3(List<String> list) throws Exception {
		/*
		 * PW--OSW--FOS--f9
		 * 
		 * FOS		- 插在文件上
		 * OSW		- 编码转换
		 * PW		- println()自动加换行
		 */
		PrintWriter out = 
		 new PrintWriter(
		 new OutputStreamWriter(
		 new FileOutputStream("d:/abc/f9"),"GBK"));
		
		for (String s : list) {
			out.println(s);
		}
		
		out.close();
	}
}








