package d1102;

import java.util.Iterator;
import java.util.LinkedList;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * add(), get(), remove(), size()
		 * 
		 * 添加 1000 万数据量
		 * [{1}, {1}, {1}, {1} ...]
		 */
		LinkedList<Integer> list = new LinkedList<>();
		long t;		
		t = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			list.add(1);//添加1000万数据
		}
		System.out.println(System.currentTimeMillis()-t);
		System.out.println("\n--头尾效率----------------------");
		t = System.currentTimeMillis();
		//访问头部和尾部
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(System.currentTimeMillis()-t);
		System.out.println("\n--中间效率---------------------");
		t = System.currentTimeMillis();
		System.out.println(list.get(500000));//中间
		System.out.println(System.currentTimeMillis()-t);
		System.out.println("\n--下标遍历---------------");
		t = System.currentTimeMillis();
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
		}
		System.out.println(System.currentTimeMillis()-t);
		
		System.out.println("\n--迭代器遍历---------------");
		//双向链表的迭代器遍历，比下标遍历效率高的多
		t = System.currentTimeMillis();
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			it.next();
		}
		System.out.println(System.currentTimeMillis()-t);
	}
}






