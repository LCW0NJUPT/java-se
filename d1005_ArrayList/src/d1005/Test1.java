package d1005;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * <> 泛型，对集合中存放的数据类型进行限制
		 * 泛型和集合工具，不支持基本类型
		 * 
		 * list = {
		 *     elementData=[null,null,null,null,null,null,null,null,null,null]
		 * }
		 */
		ArrayList<String> list = new ArrayList<>();
		System.out.println(list);
		list.add("aaa");
		list.add("nnn");
		list.add("ttt");
		list.add("jjj");
		list.add("kkk");
		list.add("qqq");
		list.add("ccc");
		list.add("aaa");
		list.add("aaa");
		list.add("aaa");
		list.add("hhh");
		list.add("yyy");
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		System.out.println(list.remove(5));
		System.out.println(list);
		System.out.println(list.remove("aaa"));
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//迭代器遍历，对数组来说，和下标便利一样（迭代：遍历）
		for (Iterator it = list.iterator(); it.hasNext();) {
			String s = (String) it.next();
			System.out.println(s);
		}
		
		//foreach 简化的迭代器遍历
		for (String s : list) {
			System.out.println(s);
		}
	}
}






