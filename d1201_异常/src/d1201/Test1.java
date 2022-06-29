package d1201;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) throws ParseException {
		/*
		 * 输入生日(yyyy-MM-dd)：1999-9-12
		 * 
		 * "1999-9-12" ---解析---> Date实例
		 * 
		 * java.util.Date 封装一个毫秒值
		 * java.text.SimpleDateFormat 
		 * 日期格式处理工具，
		 * 把Date格式化成字符串
		 * 把日期字符串，解析成Date对象
		 * 
		 * 您已经生存了 xxx 天
		 */
		System.out.print("生日(yyyy-MM-dd)：");
		String s = new Scanner(System.in).nextLine();
		//日期格式处理工具对象
		SimpleDateFormat sdf = 
		 new SimpleDateFormat("yyyy-MM-d");
		Date d = sdf.parse(s);//把日期字符串解析成Date实例
		// d.getTime()，访问它内部包含的毫秒值
		long t = System.currentTimeMillis()-d.getTime();
		t = t/1000/60/60/24;
		
		System.out.println("您已经生存了"+t+"天");
	}
}






