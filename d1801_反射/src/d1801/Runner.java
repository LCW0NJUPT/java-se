package d1801;
//运行器，根据配置文件来执行

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Runner {
	private static ArrayList<String> list = 
			new ArrayList<>();	
	static {
		try {
			BufferedReader in = 
			 new BufferedReader(
			 new InputStreamReader(
		     new FileInputStream("d:/config.txt"), "GBK"));
			
			String line;
			while((line = in.readLine()) != null) {
				line = line.replaceAll(" ", "");
				if(line.length() == 0) {
					continue;
				}
				list.add(line);
			}			
			in.close();
			System.out.println(list);			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public static void launch() throws Exception {
		for (String s : list) {
			//"day1801.A;a" --> ["day1801.A",   "a"]
			//                       0           1
			String[] a = s.split(";");//拆分字符串
			Class<?> c = Class.forName(a[0]);//获取“类对象”
			Object obj = c.newInstance();//新建实例执行无参构造
			Method m = c.getMethod(a[1]);//获取方法
			m.invoke(obj);//反射调用该方法
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		Runner.launch();
	}
}







