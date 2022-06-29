package d1502;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(
				list,
				"2019-4-2","2019-4-10",
				//"dfhgfghsdfgsd",
				"2019-4-21","2019-4-30","2019-4-1",
				"2019-4-20","2019-4-12","2019-4-3",   
				"2019-4-11","2019-4-22");
		System.out.println(list);
		//排序
		Collections.sort(list);
		System.out.println(list);
		//排序
		/*
		 * sort()方法，可以使用一个接口，接入一个比较器对象
		 * sort(list, 比较器)
		 * sort()方法，排序运算过程中，
		 * 对数据比大小时，调用比较器来比较
		 */
		Collections.sort(list, new Comparator<String>() {    
			/* 
			 * o1和o2比较大小
			 * o1大，正数
			 * o1小，负数
			 * 相同，0
			 * 
			 * 重写父类的方法，异常管道，不能比父类多
			 */
			@Override
			public int compare(String o1, String o2) {
				//日期字符串，解析成Date
				SimpleDateFormat f = 
				 new SimpleDateFormat("yyyy-MM-dd");
				try {
					Date a = f.parse(o1);
					Date b = f.parse(o2);
					return a.compareTo(b);
				} catch (Exception e) {
					//包装成能抛的，再抛出
					throw new IllegalArgumentException(e);
				}
			}
		});
		System.out.println(list);
	}
}





